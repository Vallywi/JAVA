import java.util.Scanner;

class InvalidValueException extends Exception {
    public InvalidValueException(String message) {
        super(message);
    }
}

class NonNumericInputException extends Exception {
    public NonNumericInputException(String message) {
        super(message);
    }
}

public class NumberToWordsConverter {

    private static final String[] ONES = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };

    // Convert a number (1..3999) to words in Title Case, e.g. 1234 -> "One Thousand Two Hundred Thirty-Four"
    public static String numberToWords(int num) {
        StringBuilder sb = new StringBuilder();

        if (num >= 1000) {
            int thousands = num / 1000;
            sb.append(ONES[thousands]).append(" Thousand");
            num %= 1000;
        }

        if (num >= 100) {
            if (sb.length() > 0) sb.append(" ");
            int hundreds = num / 100;
            sb.append(ONES[hundreds]).append(" Hundred");
            num %= 100;
        }

        if (num > 0) {
            if (sb.length() > 0) sb.append(" ");
            if (num < 20) {
                sb.append(ONES[num]);
            } else {
                int tens = num / 10;
                int ones = num % 10;
                sb.append(TENS[tens]);
                if (ones > 0) {
                    sb.append("-").append(ONES[ones]);
                }
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an Arabic number (1 - 3999): ");
            String input = sc.nextLine().trim();

            
            if (!input.matches("\\d+")) {
                throw new NonNumericInputException("Error: Input contains non-numeric characters.");
            }

            int value;
            try {
                value = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                
                throw new NonNumericInputException("Error: Unable to parse input as integer.");
            }

            if (value < 1 || value > 3999) {
                throw new InvalidValueException("Error: Value must be between 1 and 3999.");
            }

            String words = numberToWords(value);
            System.out.println(value + " -> " + words);

        } catch (NonNumericInputException | InvalidValueException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

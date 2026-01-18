import java.util.*;

class InvalidValueException extends Exception {
    public InvalidValueException(String message) {
        super(message);
    }
}

class InvalidRomanNumeralException extends Exception {
    public InvalidRomanNumeralException(String message) {
        super(message);
    }
}

public class RomanConverter {
    private static final TreeMap<Integer, String> arabicToRomanMap = new TreeMap<>();
    private static final Map<Character, Integer> romanToArabicMap = new HashMap<>();

    static {
        arabicToRomanMap.put(1000, "M");
        arabicToRomanMap.put(900, "CM");
        arabicToRomanMap.put(500, "D");
        arabicToRomanMap.put(400, "CD");
        arabicToRomanMap.put(100, "C");
        arabicToRomanMap.put(90, "XC");
        arabicToRomanMap.put(50, "L");
        arabicToRomanMap.put(40, "XL");
        arabicToRomanMap.put(10, "X");
        arabicToRomanMap.put(9, "IX");
        arabicToRomanMap.put(5, "V");
        arabicToRomanMap.put(4, "IV");
        arabicToRomanMap.put(1, "I");

        romanToArabicMap.put('I', 1);
        romanToArabicMap.put('V', 5);
        romanToArabicMap.put('X', 10);
        romanToArabicMap.put('L', 50);
        romanToArabicMap.put('C', 100);
        romanToArabicMap.put('D', 500);
        romanToArabicMap.put('M', 1000);
    }

    public static String arabicToRoman(int number) throws InvalidValueException {
        if (number < 1 || number > 3999) {
            throw new InvalidValueException("Error: Value must be between 1 and 3999.");
        }

        StringBuilder result = new StringBuilder();
        for (Integer key : arabicToRomanMap.descendingKeySet()) {
            while (number >= key) {
                result.append(arabicToRomanMap.get(key));
                number -= key;
            }
        }
        return result.toString();
    }

    public static int romanToArabic(String roman) throws InvalidRomanNumeralException, InvalidValueException {
        roman = roman.toUpperCase();
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            char current = roman.charAt(i);
            if (!romanToArabicMap.containsKey(current)) {
                throw new InvalidRomanNumeralException("Error: Invalid Roman numeral character '" + current + "'.");
            }

            int value = romanToArabicMap.get(current);
            if (i + 1 < roman.length()) {
                int nextValue = romanToArabicMap.get(roman.charAt(i + 1));
                if (nextValue > value) {
                    result += nextValue - value;
                    i++;
                    continue;
                }
            }
            result += value;
        }

        if (result < 1 || result > 3999) {
            throw new InvalidValueException("Error: Resulting value must be between 1 and 3999.");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a value (Arabic or Roman): ");
            String input = sc.nextLine().trim();

            if (input.matches("\\d+")) {
                // Arabic to Roman
                int arabic = Integer.parseInt(input);
                String roman = arabicToRoman(arabic);
                System.out.println("Roman Numeral: " + roman);
            } else if (input.matches("[IVXLCDMivxlcdm]+")) {
                // Roman to Arabic
                int arabic = romanToArabic(input);
                System.out.println("Arabic Number: " + arabic);
            } else {
                throw new InvalidRomanNumeralException("Error: Input contains invalid characters.");
            }

        } catch (InvalidValueException | InvalidRomanNumeralException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid number.");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}

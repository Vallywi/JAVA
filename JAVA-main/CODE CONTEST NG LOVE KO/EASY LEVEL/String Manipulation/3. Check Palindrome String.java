/*
Goal:
Determine if a given string reads the same forwards and backwards — in other words, check if it’s a palindrome.

✅ Examples:
Input: "madam"   → Output: Palindrome
Input: "hello"   → Output: Not a Palindrome
Input: "RaceCar" → Output: Palindrome (ignores case)
*/

import java.util.Scanner; // Import Scanner for input

public class PalindromeCheck { // Declare the class
    public static void main(String[] args) { // Main method — program entry point
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a string: ");
        String input = sc.nextLine(); // Read the string input

        // Step 1: Convert to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Step 2: Remove spaces (optional, for sentences like "nurses run")
        input = input.replaceAll(" ", "");

        // Step 3: Reverse the string manually
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Step 4: Compare original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close(); // Close Scanner
    }
}

/*Goal:
Given a string, count how many vowels and consonants it contains.

Example!!
Input:  "Hello World"
Output: Vowels: 3, Consonants: 7

  */

import java.util.Scanner; // Import Scanner for input

public class CountVowelsConsonants { // Declare the class
    public static void main(String[] args) { // Main method (program entry point)
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input

        System.out.print("Enter a string: ");
        String input = sc.nextLine(); // Read entire line of text (may include spaces)

        int vowels = 0;       // Counter for vowels
        int consonants = 0;   // Counter for consonants

        input = input.toLowerCase(); // Convert to lowercase for easier checking

        // Step 1: Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // Get the current character

            // Step 2: Check if character is a letter (ignore digits or symbols)
            if (ch >= 'a' && ch <= 'z') {
                // Step 3: Check if character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++; // Add to vowel count
                } else {
                    consonants++; // Otherwise, add to consonant count
                }
            }
        }

        // Step 4: Display the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        sc.close(); // Close Scanner to free resources
    }
}

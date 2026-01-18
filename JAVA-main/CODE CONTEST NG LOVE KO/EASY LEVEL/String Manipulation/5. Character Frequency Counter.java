/*
Goal:
Count how many times each character appears in a given string.
Input:  "hello"
Output: 
h = 1  
e = 1  
l = 2  
o = 1
*/

import java.util.Scanner; // Import Scanner for user input

public class CharacterFrequency { // Declare class
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a string: ");
        String input = sc.nextLine(); // Read the full string

        input = input.toLowerCase(); // Convert to lowercase for consistency
        input = input.replaceAll(" ", ""); // Remove spaces (optional)

        int[] freq = new int[256]; // Create an array to store character counts (ASCII size)

        // Step 1: Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // Get each character
            freq[ch]++; // Increase count for that character
        }

        // Step 2: Display frequency results
        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) { // Only print characters that appear
                System.out.println((char) i + " = " + freq[i]);
            }
        }

        sc.close(); // Close Scanner
    }
}

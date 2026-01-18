/*
Goal:
Count how many words are present in a sentence entered by the user.
Input:  "I love programming"
Output: 3 words
*/

import java.util.Scanner; // Import Scanner for user input

public class CountWords { // Declare the class
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine(); // Read full line input (may include spaces)

        // Step 1: Trim leading and trailing spaces
        sentence = sentence.trim();

        // Step 2: Check if the input is empty
        if (sentence.isEmpty()) {
            System.out.println("No words found.");
        } else {
            // Step 3: Split the sentence by one or more spaces
            String[] words = sentence.split("\\s+"); // "\\s+" means one or more spaces

            // Step 4: Count words
            int wordCount = words.length;

            // Step 5: Display result
            System.out.println("Number of words: " + wordCount);
        }

        sc.close(); // Close Scanner
    }
}

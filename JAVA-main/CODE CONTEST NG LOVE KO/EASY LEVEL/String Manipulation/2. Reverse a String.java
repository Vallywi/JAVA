/*
Goal:
Given a string, reverse it (i.e., print the string in backward order).

✅ Example:
Input:  "hello"
Output: "olleh"

*/

import java.util.Scanner; // Import Scanner for user input

public class ReverseString { // Declare the class
    public static void main(String[] args) { // Main method — program entry point
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter a string: ");
        String input = sc.nextLine(); // Read full line input

        String reversed = ""; // Variable to store the reversed string

        // Step 1: Loop backward through the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Add each character to 'reversed'
        }

        // Step 2: Display the reversed string
        System.out.println("Reversed String: " + reversed);

        sc.close(); // Close the Scanner to free resources
    }
}


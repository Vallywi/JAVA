/* 
Goal:
Generate and display the Fibonacci sequence up to n terms.

✅ Examples:

Input: 5 → Output: 0 1 1 2 3

Input: 8 → Output: 0 1 1 2 3 5 8 13
*/

import java.util.Scanner; // Import Scanner for input

public class FibonacciSequence { // Declare the class
    public static void main(String[] args) { // Main method — starting point of the program
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt(); // Read integer input from user and store in 'n'
        
        // Step 1: Handle special cases
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Sequence up to " + n + " terms:");
            
            // Step 2: Initialize the first two Fibonacci numbers
            int first = 0;  // First term (F0)
            int second = 1; // Second term (F1)
            
            // Step 3: Print Fibonacci series using a loop
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " "); // Print current term
                
                // Compute the next term
                int next = first + second; // Next term = sum of previous two
                first = second;            // Move second to first
                second = next;             // Move next to second
            }
        }
        
        sc.close(); // Close Scanner to free resources
    }
}

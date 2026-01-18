/*
Goal:
Given an integer n, count how many positive divisors (factors) it has.

Examples:

Input: 12 → Output: 6 (factors are 1, 2, 3, 4, 6, 12)

Input: 7 → Output: 2 (factors are 1 and 7)
*/

import java.util.Scanner; // Import Scanner for input

public class CountFactorsOfNumber { // Class declaration
    public static void main(String[] args) { // Program entry point
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Reads integer input from user and stores in variable 'n'
        
        int count = 0; // Variable to count total number of factors
        
        // Loop from 1 to n to find all divisors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // Check if i divides n with no remainder
                count++; // Increment factor count
            }
        }
        
        // Display total number of factors
        System.out.println("Number of factors of " + n + " is: " + count);
        
        sc.close(); // Close scanner
    }
}

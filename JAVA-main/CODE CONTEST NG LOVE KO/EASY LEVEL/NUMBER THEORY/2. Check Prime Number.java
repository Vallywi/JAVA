/* Goal:
Given an integer n, determine if it is a prime number.

A prime number is a number greater than 1 that has no divisors other than 1 and itself.

Examples:

Input: 7 → Output: Prime

Input: 12 → Output: Not Prime

Input: 1 → Output: Not Prime
*/

import java.util.Scanner; // Import Scanner class for user input

public class CheckPrimeNumber { // Class name
    public static void main(String[] args) { // Main method — entry point of program
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        
        System.out.print("Enter a number: "); 
        int n = sc.nextInt(); // Reads integer input and stores in variable 'n'
        
        // Call the function to check if the number is prime
        boolean isPrime = checkPrime(n);
        
        // Display result based on boolean value
        if (isPrime) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is NOT a Prime number.");
        }
        
        sc.close(); // Close scanner to avoid resource leak
    }
    
    // Function to check if a number is prime
    public static boolean checkPrime(int n) {
        // Step 1: Prime numbers are greater than 1
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        
        // Step 2: Loop through all numbers from 2 to sqrt(n)
        // If any number divides n evenly, n is not prime
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) { // If divisible by i, then not prime
                return false;
            }
        }
        
        // Step 3: If loop completes, n has no divisors except 1 and itself
        return true;
    }
}

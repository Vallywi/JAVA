/*Given an integer n, repeatedly sum its digits until you get a single-digit number.
Example: 9875 → 2.*/


import java.util.Scanner; // Import Scanner class to take input from the user

public class SumOfDigitsUntilOneDigit { // Class name (Java program must have a class)
    public static void main(String[] args) { // Main method - starting point of any Java program
        
        Scanner sc = new Scanner(System.in); // Create Scanner object 'sc' for input
        System.out.print("Enter a number: "); 
        int n = sc.nextInt(); // Reads an integer input from the user and stores it in 'n'
        
        // Call a function to reduce number to one digit
        int result = reduceToOneDigit(n); // Function returns the final single-digit sum
        
        // Output the result
        System.out.println("The single-digit sum is: " + result);
        
        sc.close(); // Close the scanner to avoid memory leaks
    }
    
    // Function that reduces a number to a single-digit by repeatedly summing its digits
    public static int reduceToOneDigit(int n) {
        // Keep repeating the loop until 'n' becomes a single-digit number
        while (n >= 10) { // Condition: if n has more than one digit
            int sum = 0; // Initialize variable to hold sum of digits
            int temp = n; // Store current number in a temporary variable for digit extraction
            
            // Inner loop: extract each digit and add it to 'sum'
            while (temp > 0) { 
                int digit = temp % 10; // Get the last digit using modulo operator
                sum += digit;           // Add the digit to sum
                temp /= 10;             // Remove the last digit (integer division)
            }
            
            n = sum; // Replace n with the new sum, and repeat the process
        }
        
        // Once the loop ends, n is already a single-digit number
        return n;
    }
}

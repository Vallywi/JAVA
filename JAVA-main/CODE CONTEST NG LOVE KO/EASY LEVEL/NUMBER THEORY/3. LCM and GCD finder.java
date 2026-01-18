/*
Goal:
Write a program that accepts two integers and computes both their GCD (Greatest Common Divisor) and LCM (Least Common Multiple).

✅ Examples:

Input: 8 12 → Output: GCD = 4, LCM = 24

Input: 5 15 → Output: GCD = 5, LCM = 15

*/

import java.util.Scanner; // Import Scanner for user input

public class LCMandGCDFinder { // Class declaration
    public static void main(String[] args) { // Entry point of the program
        Scanner sc = new Scanner(System.in); // Create Scanner object to take input
        
        // Ask user for two integers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt(); // Store first integer input in num1
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt(); // Store second integer input in num2
        
        // Step 1: Compute GCD using helper function
        int gcd = findGCD(num1, num2);
        
        // Step 2: Compute LCM using formula (a * b) / gcd
        int lcm = (num1 * num2) / gcd;
        
        // Step 3: Display results
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
        
        sc.close(); // Close scanner to prevent memory leak
    }
    
    // Function to compute GCD using the Euclidean Algorithm
    public static int findGCD(int a, int b) {
        // Keep finding remainder until one becomes zero
        while (b != 0) { 
            int temp = b;  // Store current b temporarily
            b = a % b;     // Assign remainder to b
            a = temp;      // Move previous b to a
        }
        return a; // When b becomes 0, a is the GCD
    }
}

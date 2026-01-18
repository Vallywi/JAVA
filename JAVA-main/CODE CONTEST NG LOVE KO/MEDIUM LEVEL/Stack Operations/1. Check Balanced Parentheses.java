/*
Goal:
Goal:
Given an expression with parentheses like (), {}, or [], check if it’s balanced — meaning every opening bracket has a matching closing one in the correct order.

✅ Examples:

Input	Output
(a + b)	✅ Balanced
[(a + b) * {c + d}]	✅ Balanced
(a + b]	❌ Not Balanced
({[)]}	❌ Not Balanced

  */

import java.util.*; // Import Stack and Scanner classes

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter an expression: ");
        String expression = sc.nextLine(); // Read input expression

        if (isBalanced(expression)) {
            System.out.println("✅ The expression is Balanced.");
        } else {
            System.out.println("❌ The expression is NOT Balanced.");
        }

        sc.close();
    }

    // Function to check if parentheses are balanced
    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>(); // Create a stack to hold brackets

        // Loop through each character of the string
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i); // Get current character

            // Step 1: If opening bracket, push onto stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Step 2: If closing bracket, check the top of the stack
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If stack is empty → no opening bracket to match
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop(); // Pop last opening bracket

                // Step 3: Check if the popped bracket matches current closing one
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatch found
                }
            }
        }

        // Step 4: If stack is empty at the end → all brackets matched
        return stack.isEmpty();
    }
}

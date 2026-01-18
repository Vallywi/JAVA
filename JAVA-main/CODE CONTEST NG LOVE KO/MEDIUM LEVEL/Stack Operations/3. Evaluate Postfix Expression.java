/*
Problem:

Evaluate postfix expression like 23*54*+9- (meaning (2*3) + (5*4) - 9).

Expected Output: 17
*/

import java.util.*;

public class EvaluatePostfix {
    public static void main(String[] args) {
        String expression = "23*54*+9-";
        System.out.println("Result: " + evaluate(expression));
    }

    public static int evaluate(String expr) {
        Stack<Integer> stack = new Stack<>();

        for (char c : expr.toCharArray()) {
            // If it's a digit, push to stack
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert char → int
            } else {
                // Pop two operands
                int b = stack.pop();
                int a = stack.pop();

                // Perform operation
                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }

        // Final result remains in stack
        return stack.pop();
    }
}

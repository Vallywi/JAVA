/*
Problem:

For each element in an array, find the next greater element (NGE) to its right.
If no greater element exists, print -1.

Example:
Input:  [4, 5, 2, 10]
Output: [5, 10, 10, -1]
*/

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // Remove elements smaller or equal to current
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack empty → no greater element
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push current element for future comparison
            stack.push(arr[i]);
        }

        // Print result
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }
}

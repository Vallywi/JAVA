/*
Problem:

Simulate a simple undo/redo text editor using two stacks.
  */

import java.util.*;

public class TextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();
        String text = "";

        while (true) {
            System.out.println("\nCurrent Text: " + text);
            System.out.print("Choose action (type/undo/redo/exit): ");
            String action = sc.nextLine();

            switch (action.toLowerCase()) {
                case "type":
                    System.out.print("Enter text to add: ");
                    undoStack.push(text); // Save current state
                    text += sc.nextLine();
                    redoStack.clear(); // Clear redo history
                    break;

                case "undo":
                    if (!undoStack.isEmpty()) {
                        redoStack.push(text);
                        text = undoStack.pop();
                    } else {
                        System.out.println("Nothing to undo!");
                    }
                    break;

                case "redo":
                    if (!redoStack.isEmpty()) {
                        undoStack.push(text);
                        text = redoStack.pop();
                    } else {
                        System.out.println("Nothing to redo!");
                    }
                    break;

                case "exit":
                    System.out.println("Exiting editor...");
                    return;

                default:
                    System.out.println("Invalid command!");
            }
        }
    }
}

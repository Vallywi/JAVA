import java.util.LinkedList;
import java.util.Scanner;

public class UnlimitedNames {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        LinkedList<String> names = new LinkedList<>();
        String name;
        String choice;

        System.out.println("== Name Collector using LinkedList ==");

        
        while (true) {
            System.out.print("Enter a name: ");
            name = cs.nextLine();
            names.add(name); 

            System.out.print("Do you want to add another name? (yes/no): ");
            choice = cs.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break; 
            }
        }

        
        System.out.println("\nYou entered " + names.size() + " names:");
        for (String n : names) {
            System.out.println("- " + n);
        }

        cs.close();
    }
}

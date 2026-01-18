//Sort numeric and string arrays

//Write a Java program to sort a numeric array and a string array.

import java.util.*;

class Practice1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        
        System.out.println("Hello!! Welcome to sorting factory!!");
        System.out.print("How many elements you wanted to enter for the names: ");
        int size1 = cs.nextInt();
        
        System.out.print("How about for the number sizes?: ");
        int size2 = cs.nextInt();
         cs.nextLine();
        
        String [] array_1 = new String[size1];
        
        System.out.println("\nFor " + size1 + " names!!");
        for(int i = 0; i < size1; i++){
            System.out.print("Enter for name no." + (i + 1) + " : ");
            array_1[i] = cs.nextLine();
        }
        
        int [] array_2 = new int[size2];
        
        System.out.println("\nFor the " + size2 + " numbers!!");
        for(int i = 0; i < size2; i++){
            System.out.print("Enter for number no." + (i + 1) + " : ");
            array_2[i] = cs.nextInt();
        }
        
        System.out.println("\nUnordered names:");
        for(String s : array_1){
            System.out.println(s);
        }
        
        Arrays.sort(array_1);
        
        
        System.out.println("\nSorted names:");
        for(String s : array_1){
            System.out.println(s);
        }
        
        System.out.println("\nUnordered numbers:");
        for(int s : array_2){
            System.out.println(s);
        }
        
        Arrays.sort(array_2);
        
        System.out.println("\nOrdered Numerical Numbers:");
        for(int s : array_2){
            System.out.println(s);
        }
        
    }
}

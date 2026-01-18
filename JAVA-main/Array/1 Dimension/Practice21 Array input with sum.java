import java.util.Scanner;
public class trial{
    public static void main(String [] args){
       Scanner cs = new Scanner(System.in); 
       int sum = 0;
       
        System.out.print("How many size of arrays you will input?: ");
        int size = cs.nextInt();
        
        int [] number = new int[size];
        
        for (int i = 0; i < size; i++){
            System.out.print("Enter for the size[" + (i) + "]: ");
            number [i] = cs.nextInt();
            sum += number[i];
        }
        
        for(int i = 0; i < size; i++){
            System.out.println("For number[" + i + "]: " + number[i]);
        }
        
        
        System.out.println("\nThe sum of all array is: " + sum);
    }
}

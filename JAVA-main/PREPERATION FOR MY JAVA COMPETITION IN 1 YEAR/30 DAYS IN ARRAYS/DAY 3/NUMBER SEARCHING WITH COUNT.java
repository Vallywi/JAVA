import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String [] args){
    Scanner cs = new Scanner(System.in);
    
     ArrayList <Integer> Arrays = new ArrayList<>();
     int [] arr = {1, 2, 3, 4, 5, 6, 6, 7, 10};
     
     System.out.print("Search a number: ");
     int num = cs.nextInt();
        
    for(int i = 0; i < arr.length; i++){
        if(num == arr[i]){
            Arrays.add(i);
        }
    }
    
       if(Arrays.size() == 0){
        System.out.println("The numerical value of " + num + " is not here!!");
    } else{
        System.out.println("The numerical of " + num + " has been found!!");
        System.out.println("There are " + Arrays.size() + " number here!!");
    }
    
        
        
        
        
    }
}

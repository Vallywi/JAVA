import java.util.Scanner;

public class Main{
    public static void main(String [] args){
    Scanner cs = new Scanner(System.in);
    int count = 0;
    
     int [] arr = {1, 2, 3, 4, 5, 6, 6, 7, 10};
     
     System.out.print("Search a number: ");
     int num = cs.nextInt();
        
    for(int i = 0; i < arr.length; i++){
        if(num == arr[i]){
            count++;
        }
    }
    
    if(count == 0){
        System.out.println("The number " + num + " was not found!!");
    } else{
        System.out.println("The number " + num + " was here!!");
        System.out.println("Searched directory: " + count);
    }
    
        
        
        
        
    }
}

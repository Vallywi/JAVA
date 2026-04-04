// Java program to remove duplicates from an array

package DAY5;
import java.util.*;
class array5A{
    public static void main(String [] args){
        int [] arr = {1, 2, 2, 7, 6, 4, 10, 15, 14};
        Arrays.sort(arr);
        int index = 1;
        
        for(int i =0; i < arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                arr[index] = arr[i+1];
                index++;
            }
        }
        
        for(int i = 0; i < index; i++){
            System.out.print(arr[i] + " ");
        }
    
    }
}
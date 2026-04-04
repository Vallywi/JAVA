//4.	Reverse array using a new array

package DAY 2;
public class array2A{
    public static void main(String [] args){
        int [] arr = {2, 1, 5, 4, 11, 9, 15};
        
        
        int [] arr1 = new int[arr.length];
        
        for(int i = 0; i < arr.length;i++){
            arr1[i] = arr[i];
        }
        int high = arr.length-1;
        int low = 0;
        
         while(low < high){
            int temp = arr1[low];
            arr1[low] = arr1[high];
            arr1[high] = temp;
            high--;
            low++;
        }
        
        System.out.println("Original Array: ");
        for(int f: arr){
            System.out.print(f + " ");
        }
        
         System.out.println("\nNew Array: ");
        for(int s: arr1){
            System.out.print(s + " ");
        }
    }
} {
    
}

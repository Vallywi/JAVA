public class Array1{
    public static void main (String [] args){
        int [] arr = {11, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14};
        
        int low = arr[0];
        int high = arr[0];
        
        for(int i = 0; i < arr.length;i++){
            if(high < arr[i]){
             high = arr[i];
            }
            if(low > arr[i]){
             low = arr[i];
            }
        }
        
        System.out.println("The highest value of an array: " + high);
        System.out.println("The lowest value of an array: " + low);
        
    }
}
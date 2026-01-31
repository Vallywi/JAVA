public class Array4{
    public static void main(String [] args){
        int [] arr = {1, 2, 3, 10, 5, 6, 7, 8};
        int hello = arr[0];
        int yes = 0;
        int real = arr.length -1;
        
        for(int i = 1; i < arr.length;i++){
            if(arr[i] > hello){
                hello = arr[i];
                yes++;
        }
        }
        
        if(yes == real){
            System.out.println("The array is sorted!!!");
        }else{
            System.out.println("The array is not sortedd!!!!");
        }
    }
}
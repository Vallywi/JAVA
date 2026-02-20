//Rotate array by K steps (right rotation)
//Well base on the given solutions, this is I think the slowest implementation? but I guess I tried my best just to done this
//[2, 3, 5, 6, 7, 10]
// k = 2;

//The output must be:
// [7, 10, 2, 3, 5, 6]
//well there's a better version for this and I will paste it here once that I review it
//now I'll try if it will works on leetcode but hopefully
package DAY8;

class Array08{
    public static void main(String [] args){
        int [] arr = {2, 3, 5, 6, 7, 10};
        int k = 2;
        int hello = arr.length-1;
        
        for(int s : arr){
            System.out.print(s + " ");
        }
        
        int start = 0;
        int end = arr.length -1;
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        System.out.println("\n");
        for(int s : arr){
            System.out.print(s + " ");
        }
        
        for(int i = 0; i < k;i++){
            if(i < k-1){
                int temp = arr[i];
                arr[i] = arr[k-1];
                arr[k-1] = temp;
            }
        }
        System.out.println("\n");
        for(int s : arr){
            System.out.print(s + " ");
        }
        
        for (int i = 0; i < arr.length - k;i++){
            if(i < arr.length-(arr.length-k)){
                int temp = arr[i + k];
                arr[i + k] = arr[hello];
                arr[hello] = temp;
                hello--;
            }
        }
        
        System.out.println("\n");
        for(int s : arr){
            System.out.print(s + " ");
        }
        
        
    }
}
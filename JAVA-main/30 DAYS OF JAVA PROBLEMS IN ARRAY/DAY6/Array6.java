package DAY6;
//Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
//Output: [1, 2, 4, 3, 5, 0, 0, 0]

class Array6{
    public static void main(String [] args){
        int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int [] arr1 = new int[arr.length];
        int index = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr1[index] = arr[i];
                index++;
            }
        }
        
        for(int s: arr1){
            System.out.print(s + " ");
        }
    }
}
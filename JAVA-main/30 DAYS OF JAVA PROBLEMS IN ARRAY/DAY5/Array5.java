package DAY5;
public class Array5 {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 2, 5, 4 ,8, 8, 7, 7, 11, 10};
        
        System.out.println("Original Array:")
        for(int s : arr){
            System.out.print(s + " ");
        }

        int added = 0;
        int adder = 1;

        int added1 = 0;
        int adder2 = 1;

        for(int i = 0; i < arr.length-1;i++){
            if(arr[added] > arr[adder]){
                int temp = arr[added];
                arr[added] = arr[adder];
                arr[adder] = temp;
            }
            added++;
            adder++;
        }

        for(int i = 0; i < arr.length-1;i++){
            if(arr[added1] > arr[adder2]){
                int temp = arr[added1];
                arr[added1] = arr[adder2];
                arr[adder2] = temp;
            }
            added1++;
            adder2++;
        }

        System.out.println("\nSorted Array");
        for(int m : arr){
            System.out.print(m + " ");
        }

        int index = 1;

        for(int i = 1; i < arr.length;i++){
            if(arr[i] != arr[i - 1]){
                arr[index] = arr[i];
                index++;
            }
        }

        System.out.println("\nRemoving the duplication in not a sorted array:");
        for(int i =0; i < index;i++){
            System.out.print(arr[i] + " ");
        }

    }
}

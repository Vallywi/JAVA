package DAY5;
import java.util.Scanner;
public class Array5 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 5, 4, 8, 7, 11, 10};
        Scanner cs = new Scanner(System.in);

        for(int s : arr){
            System.out.print(s + " ");
        }

        int added = 0;
        int adder = 1;

        for(int i = 0; i < arr.length-1;i++){
            if(arr[added] > arr[adder]){
                int temp = arr[added];
                arr[added] = arr[adder];
                arr[adder] = temp;
            }
            added++;
            adder++;
        }

        System.out.println("\n");
        for(int m : arr){
            System.out.print(m + " ");
        }


    }
}

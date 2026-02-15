package DAY5;
import java.util.Scanner;
public class Array4B {
    public static void main(String[] args) {
        int [] arr = {2, 4, 4, 5, 6, 6, 4, 9, 20, 10};
        Scanner cs = new Scanner(System.in);

        for(int s: arr){
            System.out.print(s + " ");
        }

        System.out.print("\nEnter a number that you wanted to remove: ");
        int num = cs.nextInt();

        int index = 0;

        for(int i = 0; i < arr.length;i++){
            if(arr[i] != num){
                arr[index] = arr[i];
                index++;
            }
        }

        for(int i = 0; i < index;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("Enter the size of the numbers that you wanted to input: ");
        int size = cs.nextInt();
        
        int [] arr = new int[size];
        
        for(int i = 0; i < size; i++){
            System.out.print("For no." + (i + 1) + " : ");
            arr[i] = cs.nextInt();
            sum += arr[i];
        }
        
        System.out.print("\nThe sum are: " + sum);
        
        
    }
}

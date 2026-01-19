import java.util.Scanner;
public class array2{
	public static void main(String [] args){
	Scanner cs = new Scanner(System.in);
	System.out.print("Enter the size for an array: ");
	int size = cs.nextInt();
	
	int [] arr = new int[size];

	for(int i = 0; i < size; i++){
	System.out.print("Enter a number for #" + (i + 1) + " : ");
	arr[i] = cs.nextInt();

	}

	System.out.println("Original arragement of arrays: ");
	for(int s : arr){
	System.out.print(s + " ");
	}

	//reversed part implementation
	
	int right = 0;
	int left = arr.length - 1;

	while(right < left){
	int temp = arr[right];
	arr[right] = arr[left];
	arr[left] = temp;

	right++;
	left--;
	}
	
	System.out.println("\nThe reversed array implementation: ");
	for(int s : arr){
	System.out.print(s + " ");
	}


}
}
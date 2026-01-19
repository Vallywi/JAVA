import java.util.Scanner;
public class array1B{
	public static void main(String [] args){
	Scanner cs = new Scanner(System.in);
	
	System.out.print("Enter the array you wanted to add: ");
	int size = cs.nextInt();

	int [] arr = new int[size];

	for(int i = 0; i < size; i++){
	System.out.print("Enter a number for " + ( i + 1 ) + " : ");
	arr[i] = cs.nextInt();
		}


	System.out.print("\n");
	for(int s : arr){
	System.out.println(s);
	}
	
	int max = arr[0];
	int min = arr[0];

	
	for(int i = 0; i < size; i++){
	if(max < arr[i]){
	    max = arr[i];
	} 
	if(min > arr[i]){
	min = arr[i];
	}
	
	}
	
	System.out.print("\n");

	System.out.println("The minimum number is: " + min);
	System.out.println("The maximum number is: " + max);

	



}
}
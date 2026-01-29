import java.util.Scanner;
public class Array4B{
 	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int [] arr = {2, 3, 4, 5, 11, 13};
	int index = 0;

	System.out.print("Enter a number to print the index: ");
	int target = sc.nextInt();	
	
	
	for(int i = 0; i < arr.length; i++){
	if(arr[i] == target){
	index = i;
	}
	}
	
	if(index == 0){
	System.out.println("The number you input is not here in the array");
	}else{
	System.out.println(index);
	}
}
}
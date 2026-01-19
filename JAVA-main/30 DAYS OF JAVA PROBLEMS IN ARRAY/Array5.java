import java.util.Scanner;
public class Array5{
	public static void main(String [] args){
	Scanner cs = new Scanner(System.in);
	int [] arr = {2, 3, 4, 1, 6, 7, 11, 10, 15};
	
	for(int s : arr){
	System.out.print(" " + s);
	}

	System.out.print("\nEnter a number that you want to remove: ");
	int num = cs.nextInt();
	
	for(int i = 0; i < arr.length;i++){
	if(arr[i] == num){
	arr[i] = 0;
	}
	}
	
	for(int s : arr){
	System.out.print(" " + s);
	}


	}
}
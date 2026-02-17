//Linear search for an element and the number of occurance

import java.util.Scanner;

class Array3{
	public static void main(String [] args){
	Scanner cs = new Scanner (System.in);
	int [] arr = {1, 2, 3, 4, 2, 2, 1, 1, 1, 1, 5, 6, 7};
	
	System.out.print("Search a number that you wanted to find: ");
	int number = cs.nextInt();
	int count = 0;
	
	for(int i = 0; i < arr.length; i++){
	if(number == arr[i])
	count++;
	}

	if(count >= 1)
	System.out.println("The number was found!! and the count is " + count);
	else
	System.out.println("the number you are searching is not here!!");

}
}
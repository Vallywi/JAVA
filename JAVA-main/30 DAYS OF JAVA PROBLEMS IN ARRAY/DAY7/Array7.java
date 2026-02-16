package DAY7;

// [3, 4, 10, 9, 8, 4, 1, 23];
// [23, 3, 4, 10, 9, 8, 4, 1];

public class Array7{
	public static void main(String [] args){
	int [] arr = {3, 4, 10, 9, 8, 4, 1, 23};
    
    System.out.println("Original Array format: ");
    
    for(int s : arr){
        System.out.print(s + " ");
    }
    
    System.out.println("\n");
    int last = arr[arr.length -1];
    
	for(int i = arr.length - 1; i > 0; i--){
	arr[i] = arr[i-1];
	}
	
	System.out.println("Editted: ");

    arr[0] = last;
	for(int s : arr){
	System.out.print(s + " ");
	}
	
}
}

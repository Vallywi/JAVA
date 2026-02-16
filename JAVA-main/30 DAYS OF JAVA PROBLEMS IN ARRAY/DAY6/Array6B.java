package DAY6;
// [3, 4, 5, 1, 5, 7, 9, 10]
// [4, 5, 1, 5, 7, 9, 10, 3]

class Array6B{
	public static void main(String [] args){
	
	int [] arr = {3, 4, 5, 1, 5, 7, 9, 10};

    System.out.println("Original Sorted Array:");
    for(int f : arr){
        System.out.print(f + " ");
    }
    
    System.out.print("\n\nMove to the left numerical Array:\n");
	int first = arr[0];

	for(int i = 0; i < arr.length - 1;i++){
	arr[i] = arr[i + 1];
	}
	
	arr[arr.length - 1] = first;

	for(int s : arr){
	System.out.print( s + " ");	
	}
}
}
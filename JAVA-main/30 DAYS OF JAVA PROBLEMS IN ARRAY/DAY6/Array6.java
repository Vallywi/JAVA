package DAY6;

// [21, 20, 31, 56, 30, 40, 10, 4]
// [21, 4, 31, 56, 40, 10, 30, 20]

class Array6{
	public static void main(String [] args){
	int [] arr = {21, 20, 31, 56, 30, 40, 10, 4};
	
		System.out.println("Original Array:");
	for(int f : arr){

		System.out.print(f+ " "); 
	}
	System.out.print("\n\nMoving all Zeros to the left:\n");

	int end = arr.length - 1;

	for(int i = 0; i <=end;i++){
	if(arr[i] % 10 == 0){
	int temp = arr[i];
	arr[i] = arr[end];
	arr[end] = temp;
	end--;
    i--;
	}
	}

    for(int s : arr){
        System.out.print(s + " ");
    }
}
}

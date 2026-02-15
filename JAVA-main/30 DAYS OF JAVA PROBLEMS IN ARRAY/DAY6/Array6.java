package DAY6;

public class Array6{
	public static void main(String [] args){
	int [] arr{21, 20, 31, 56, 30, 40, 10, 4};
	
	int end = arr.length - 1;

	for(int i = 0; i < arr.length;i++){
	if(arr[i] % 10 == 0){
	int temp = arr[i];
	arr[i] = arr[end];
	arr[end] = temp;

	end--;
	}
	}
}
}

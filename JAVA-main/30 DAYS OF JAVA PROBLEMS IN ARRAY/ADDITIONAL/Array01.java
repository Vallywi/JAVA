package ADDITIONAL;
//[2, 3, 4, 6, 8, 10, 2, 4]

public class Array01{
	public static void main(String [] args){
	
	int [] arr = {2, 3, 4, 6, 8, 10, 2, 4};
	
	System.out.println("Original Output of an Array: ");
	for(int s : arr){
		System.out.print(s + " ");
	}
    
    int index = 0;
    
    for(int i = 0; i < arr.length; i++){
        boolean duplicate = false;
        
        for(int j = 0; j < index; j++){
            if(arr[i] == arr[j]){
            duplicate = true;
            break;
            }
        }
        
        if(!duplicate){
        arr[index] = arr[i];
        index++;
        }
        
    }
    
    System.out.println();
    for(int i = 0; i < index; i++){
        System.out.print(arr[i] + " ");
    }

}




}
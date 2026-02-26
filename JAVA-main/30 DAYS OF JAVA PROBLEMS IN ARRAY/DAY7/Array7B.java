package DAY7;

//[2, 3, 4, 6, 8, 10, 2, 4]
//finding the second highest element

public class Array7B{
	public static void main(String [] args){
	int [] arr = {2, 3, 4, 6, 8, 10, 12, 2, 4};
	
	System.out.println("This is the original Array: ");
	for(int s : arr){
		System.out.print(s + " ");
	}
	
	int high = arr[0];
	int index = 0;

	for(int i = 0; i < arr.length;i++){
	if(high < arr[i]){
	    high = arr[i];
	}
	}

    for(int i = 0; i < arr.length;i++){
        boolean removehigh = false;
        
        for(int j = 0; j < index; j++){
            if(arr[i] == high){
                removehigh = true;
                break;
            }
        }
        
        if(!removehigh){
            arr[index] = arr[i];
            index++;
        }
    }
    
    int newhigh = arr[0];
    for(int i = 0; i < index; i++){
        if(newhigh < arr[i]){
            newhigh = arr[i];
        }
    }
    
    System.out.println("\n\nThe second highest element:");
    System.out.println(newhigh);
	

	}
}
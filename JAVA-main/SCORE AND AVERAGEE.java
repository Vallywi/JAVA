import java.util.Scanner;
public class Test{
	public static void main(String [ ] args){
	String name;
	int num;
	int sum = 0;
	Scanner Zarrah = new Scanner(System.in);
	
	System.out.print("Enter your name: ");
	name = Zarrah.nextLine();
	
	
	System.out.print("Enter the scores you will put: ");
	num = Zarrah.nextInt();
	
	int arr[] = new int [num];
	for(int i = 0; i < num; i++){
	System.out.print("Enter your score number in " + (i + 1) + " :");
	arr[i] = Zarrah.nextInt();
	sum += arr[i];
	}

	float average = (float)sum / num;
	int lowest = arr[0];
	int highest = arr[0];

	for(int i = 0; i < num; i++){
	if(arr[i] > highest) highest = arr[i];
	if(arr[i] < lowest) lowest = arr[i];
	}

	System.out.println("\n----The Summary---");
	System.out.println("Name: " + name);
	System.out.print("Scores: ");
	for(int i = 0; i < num; i++){
	System.out.print(arr[i] + " ");
	}
	System.out.println("\nThe lowest: " + lowest);
	System.out.println("The Highest: " + highest);
	System.out.println("The sum: " + sum + "\nAverage: " + average);
	

	if(average <= 100 && average >=90){
	System.out.println("Your Letter Grade is A");
	}
	else if(average <= 89 && average >=80){
	System.out.println("Your Letter Grade is B");
	}
	else if(average <= 79 && average >=75){
	System.out.println("Your Letter Grade is C");
	}
	else if(average <= 79 && average >=75){
	System.out.println("Your Letter Grade is D");
	}
	else if(average <= 74 && average >=70){
	System.out.println("Your Letter Grade is E");
	}
	else if(average <= 69){
	System.out.println("Your Letter Grade is F");
	}

	}
}

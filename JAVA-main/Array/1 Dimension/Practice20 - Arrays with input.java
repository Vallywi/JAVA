import java.util.Scanner;
public class Practice20{

	public static void main (String [] args){
	Scanner cs = new Scanner(System.in);
	int length;


	System.out.print("Enter the numbers of names you will input: ");
	length = cs.nextInt();
	
	

	String [] name= {"Zahara", "Maincoon", "Java"};
	

	for(int i = 0; i < length; i++){
	System.out.println("Name[" + (i + 1) + "]: " +name[i]);
	}
}
}

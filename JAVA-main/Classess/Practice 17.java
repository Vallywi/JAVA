import java.util.Scanner;
class MathTool{

	int calculate(int a, int b, String operation){
	if(operation.equals("add")){
	return a + b;
	}
	else if(operation.equals("sub")){
	return a - b;
	}
	else if (operation.equals("mul")){
	return a * b;
	}
	else {
	System.out.println("Invalid Operation");
	return 0;
	}
	}


	double calculate(double a, double b, String operation){
	if(operation.equals("add")){
	return a + b;
	}
	else if(operation.equals("sub")){
	return a - b;
	}
	else if (operation.equals("mul")){
	return a * b;
	}
	else {
	System.out.println("Invalid Operation");
	return 0;
	}
	}

	
	int calculate(int a, int b, int c, String operation){
	if(operation.equals("add")){
	return a + b + c;
	}
	else if(operation.equals("sub")){
	return a - b - c;
	}
	else if (operation.equals("mul")){
	return a * b * c;
	}

	else {
	System.out.println("Invalid Operation");
	return 0;
	}
	}

	}

public class Practice17{
	public static void main(String [] args){
	Scanner cs = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int num1 = cs.nextInt();
	System.out.print("Enter the second number: ");
	int num2 = cs.nextInt();
	cs.nextLine();

	System.out.print("Enter operation (add/sub/mul): ");
	String opera = cs.nextLine();

	MathTool trial1 = new MathTool();

	if(opera.equals("add")){
	System.out.println("The result of two integers: " + trial1.calculate(num1, num2, opera));
	}
	else if(opera.equals("sub")){
	System.out.println("The result of two integers: " + trial1.calculate(num1, num2, opera));
	
	}
	else if(opera.equals("mul")){
	System.out.println("The result of two integers: " + trial1.calculate(num1, num2, opera));
	}
	else{
	System.out.println("Invalid operation");
	}
cs.close();
}
}

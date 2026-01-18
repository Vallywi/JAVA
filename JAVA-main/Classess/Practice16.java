class Calculator{


	int add(int a, int b){
	return a + b;
	}

	int add(int a, int b, int c){
	return a + b + c;
	}

	double add(double a, double b){
	return a + b; 
	}

}

public class Practice16{
	public static void main(String [] args){
	Calculator calc = new Calculator();

	System.out.println("Adding the 2 values: " + calc.add(3, 4));
	System.out.println("Adding the 2 decimal values: " + calc.add(4.6 , 4.7));
	System.out.println("Adding the 3 values: " + calc.add(3 , 4 , 5));

}
}

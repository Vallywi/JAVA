class MathOperation{

	

	int multiply(int a, int b){
	return a * b;
	}

	double multiply(double a, double b){
	return a * b;
	}


	int multiply(int a, int b, int c){
	return a * b * c;
	}

}

public class Practice15{
	public static void main(String [] args){
	MathOperation mathe = new MathOperation();

	System.out.println("For 2 value: " + mathe.multiply( 5, 3));
	System.out.println("For 2 decimal value: " + mathe.multiply(5.4, 8.6));
	System.out.println("For 3 values: " + mathe.multiply(4, 5, 6));
}
}

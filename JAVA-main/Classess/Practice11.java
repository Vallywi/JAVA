class Circle{
	double radius;

	Circle(double radius){
	this.radius = radius;
}

	void display(){
	System.out.println("\nEnlisted Radius: " + radius);

	}

	//methods
	double getArea(){
	return  Math.PI * radius * radius;
	}

	double getCircumference(){
	return 2 * Math.PI * radius;
	}
}

public class Practice11{
	public static void main(String [] args){
	Circle trial = new Circle(5);
	trial.display();
	double area = trial.getArea();
	System.out.println("Area of the Circle: " + area);
	double circumference = trial.getCircumference();
	System.out.println("The Circumference: " + circumference);

}
}

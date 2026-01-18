
	//class
	
	class Car{
	int price;
	String name;
	
	// constructor
	Car(String name, int price){
	this.name = name;
	this.price = price;

	}

	void accelerate(){
	System.out.println("The name of the car is " + name +" \nand with the price staggering in " + price);

	}

	}

	//main
	public class Practice{
		public static void main(String [] args){
		Car mycar = new Car("Mitsubishi", 1200);
		Car mycar1 = new Car("Toyota", 5000);
		mycar.accelerate();
		mycar1.accelerate();
}

}

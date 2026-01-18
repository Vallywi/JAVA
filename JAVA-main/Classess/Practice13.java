class Pet{
	String name;
	String type;
	int age;

	//Constructor no.1
	Pet(){
	name = "Unknown";
	type = "Unknown";
	age = 0;
	}

	//Constructor no.2
	Pet(String name, String type){
	this.name = name;
	this.type = type;
	this.age = 0;
	}

	//Constructor no.3
	Pet(String name, String type, int age){
	this.name = name;
	this.type = type;
	this.age = age;
	}

	void display(){
	System.out.println("\nName: " + name);
	System.out.println("Type: " + type);
	System.out.println("Age: " + age);
	}
}

public class Practice13{
	public static void main(String [] args){
	Pet pet1 = new Pet();
	Pet pet2 = new Pet("Ali", "Husky");
	Pet pet3 = new Pet("Alex", "Chiuaua", 3);

	System.out.println("\n=== Default Pet ===");
	pet1.display();
	System.out.println("=== Pet with 2 parameters ===");
	pet2.display();
	System.out.println("=== Pet with 3 parameters ===");
	pet3.display();

}
}

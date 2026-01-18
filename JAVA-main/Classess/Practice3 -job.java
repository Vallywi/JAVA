class Job{
	String name;
	String Address;
	int age;

	Job(String name, String Address, int age){
	this.name = name;
	this.Address = Address;
	this.age = age;
	}

	void display(){
	System.out.println("\nWork Job!!");
	System.out.println("Name: " + name + "\nAddress: " + Address + "\nAge: " + age);
	}
}

	public class Practice3{
	public static void main(String [] args){
	
	Job job1 = new Job("Vallirie", "Escopa 1", 21);
	Job job2 = new Job("Zarrah", "Dela Paz", 19);
	job1.display();
	job2.display();

	}
	}

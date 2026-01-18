class Student{
	String name;
	int age;

	Student(String name, int age){
	this.name = name;
	this.age = age;
}


	void display(){
	System.out.println("Student Name: " + name +"\nAge: " + age);
	System.out.print("\n");
	}
	}

	public class Practice2{
	public static void main(String [] args){
	Student student1 = new Student("Vallirie", 21);
	Student student2 = new Student("Zarrah", 19);
	
	student1.display();
	student2.display();

	}
	}

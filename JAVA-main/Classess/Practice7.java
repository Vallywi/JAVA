class Person{
	String name;
	int age;
	
	Person(String name, int age){
	this.name = name;
	this.age = age;
	}

	void display(){
	System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
	}

}

public class Practice7{
	public static void main(String [] args){
	Person newperson = new Person("Vallirie", 21);
	newperson.display();


	}

}

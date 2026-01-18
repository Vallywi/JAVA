import java.util.Scanner;
class Student{
	String name;
	int age, student_no;
	
	//Constructor
	Student(String n, int a, int c){
	name = n;
	age = a;
	student_no = c;
	}
	
	void display(){
	System.out.println("\nName: " + name + 
			 "\nAge: " + age +
	                  "\nStudent no.: " + student_no);

	}
}

public class Practice5{
	public static void main(String [] args){
	Scanner cs = new Scanner(System.in);

	System.out.print("Enter your Name: ");
	String n = cs.nextLine();
	System.out.print("Enter you age: ");
	int a = cs.nextInt();
	System.out.print("Enter your Student No.: ");
	int c = cs.nextInt();
	
	Student s1 = new Student(n,a,c);
	s1.display();

}
}

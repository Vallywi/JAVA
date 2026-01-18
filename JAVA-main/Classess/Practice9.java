public class Student{
	String name;
	int gradeLevel;
	double averageGrade;

  //constructor
	Student(String name, int gradeLevel, double averageGrade){
	this.name = name;
	this.gradeLevel = gradeLevel;
	this.averageGrade = averageGrade;
	}

  //method
	boolean isPassing(){
	if(averageGrade > 75){
	return true;
		}
	else {
	return false;
		}
	}

  //method
	void addBonus(double points){
	averageGrade += points;
	if(averageGrade > 100){
	averageGrade = 100;
	}
	}

  //method
	void display(){
	System.out.println("\nName: " + name);
	System.out.println("Grade Level: " + gradeLevel);
	System.out.println("Average Grade: " + averageGrade);
	}

	public static void main(String [] args){
	Student newStudent = new Student("Vallirie", 12, 74.5);
	newStudent.display();
	System.out.println("After adding bonus points.......");
	newStudent.addBonus(5);
	newStudent.display();
	boolean result = newStudent.isPassing();
	System.out.println("Passing: " + result);

	Student newStudent1 = new Student("Zarrah", 12, 60.1);
	newStudent1.display();
	System.out.println("After adding bonus points.......");
	newStudent1.addBonus(5);
	newStudent1.display();
	result = newStudent1.isPassing();
	System.out.println("Passing: " + result);

	


}
}

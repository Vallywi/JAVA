public class Student1{
	String name;
	int gradeLevel;
	double averageGrade;
	
	Student1(String name, int gradeLevel, double averageGrade){
	this.name = name;
	this.gradeLevel = gradeLevel;
	this.averageGrade = averageGrade;
	}


	boolean isPassing(){
	if(averageGrade > 75){
	return true;
		}
	else {
	return false;
		}
	}

	boolean isWithHonor(){
	return averageGrade > 90;


	}

	void addBonus(double points){
	averageGrade += points;
	if(averageGrade > 100){
	averageGrade = 100;
	}
	}

	void display(){
	System.out.println("\nName: " + name);
	System.out.println("Grade Level: " + gradeLevel);
	System.out.println("Average Grade: " + averageGrade);
	}

	public static void main(String [] args){
	Student1 newStudent = new Student1("Vallirie", 12, 88.5);
	newStudent.display();
	System.out.println("After adding bonus points.......");
	newStudent.addBonus(5);
	newStudent.display();
	boolean result = newStudent.isPassing();
	System.out.println("Passing: " + result);
	boolean honor = newStudent.isWithHonor();
	System.out.println("With honors? = " + honor);

	Student1 newStudent1 = new Student1("Zarrah", 12, 60.1);
	newStudent1.display();
	System.out.println("After adding bonus points.......");
	newStudent1.addBonus(5);
	newStudent1.display();
	result = newStudent1.isPassing();
	System.out.println("Passing: " + result);
	honor = newStudent1.isWithHonor();
	System.out.println("With honors? = " + honor);
}
}

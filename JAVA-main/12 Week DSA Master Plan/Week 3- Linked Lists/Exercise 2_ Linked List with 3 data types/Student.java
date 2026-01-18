package Main;

public class Student {
    String name;
    int id;
    int gradeLevel;

    public Student(String name, int id, int gradeLevel){
        this.name = name;
        this.id = id;
        this.gradeLevel = gradeLevel;
    }
    
    public String toString(){
        return "Name: " + name + "\nStudent ID: " + id + "\ngradeLevel: " + gradeLevel;
    }
    

}

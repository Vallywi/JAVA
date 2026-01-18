package Main;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.LinkedList;
public class Main {
       
    /**
     * @param args
     */
    public static void main(String [] args){
        Scanner cs = new Scanner(System.in);
        Output disp = new Output();
        LinkedList <Student> students = new LinkedList<>();

            int num = 0;
            int choices = 0;
            int gradeLevel = 0;
            int studentId = 0;
            String name;

            do{
                 disp.display();
                 System.out.print("Enter a choice: ");
                try{
                 choices = cs.nextInt();
                 cs.nextLine();
                 }catch(InputMismatchException e){
                 System.out.println("Wrong input!! only from 1-4 !!");
                 cs.nextLine();
                }

                switch(choices){
                    case 1: 
                        System.out.print("Enter a name: ");
                        name = cs.nextLine();
                        cs.nextLine();
                        System.out.print("Enter the Student ID: ");
                        studentId = cs.nextInt();
                        System.out.print("Enter the Grade Level [1-6]: ");
                        try{
                            gradeLevel = cs.nextInt();
                        }catch(InputMismatchException e){
                            System.out.println("Not wrong variable!!");
                            cs.nextLine();
                        }
                        students.add(new Student(name, studentId, gradeLevel));
                        System.out.println("The information has been added!!\n");
                    break;
                    
                    case 2:
                        for(Student s: students){
                            System.out.println("\n" + s);
                        }
                        System.out.println("\n");
                    break;
                    
                    case 3:
                        for(Student s: students){
                            System.out.println("\n" + s);
                        }

                        System.out.print("Enter the student ID that you wanted to remove: ");
                        int removeId = cs.nextInt();
                        for(Student s : students){
                        if(s.id == removeId){
                        students.remove(s);
                        System.out.println("The student " + removeId + " has been deleted!!");
                        }
                        else{
                            System.out.println("The student ID " + removeId + " was not found");
                        }
                        }

                        break;
                    
                    case 4:
                        System.out.println("Thank you for visiting our System!!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong inputed number, please try again!!");
                }

            } while(num != 4);
            

    }


}


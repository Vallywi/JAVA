package Hello;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Hello {
    @SuppressWarnings("resource")
    public static void main(String [] args){
    Scanner cs = new Scanner(System.in);
    Output disp = new Output();
    Array1 aray = new Array1();
    int choice = 0;

    int num = 0;
    do{
    disp.display();
    System.out.print("Enter a choice: ");
    try{
    choice = cs.nextInt();
    cs.nextLine();
     }catch(InputMismatchException e){
                System.out.println("Wrong input of the data types, please try again!!");
                cs.nextLine();
            }

    switch(choice){
        case 1: 
            System.out.print("Enter a name that you wanted to add: ");
            String name = cs.nextLine();
            aray.addName(name);
            break;

        case 2:
            aray.display();
            break;
        
        case 3:
            System.out.print("Enter a name that you wanted to remove: ");
            name = cs.nextLine();
            aray.removeName(name);
            break;

        case 4:
            System.out.println("Thank you for using our System!!");
            System.exit(0);
    }


    }while(num !=4);

    }

}

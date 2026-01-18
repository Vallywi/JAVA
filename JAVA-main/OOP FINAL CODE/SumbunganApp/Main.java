package SumbunganApp;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner cs = new Scanner(System.in);
        LinkedList <User> citizens = new LinkedList<>();
        LinkedList <Complaint> complaints = new LinkedList<>();

        Output disp = new Output();
        CitizenPortal citis = new CitizenPortal(cs, citizens, complaints);
        AdminPortal admin = new AdminPortal(cs, complaints);
        int choice = 0;

        citis.loadCitizensFromFile();
        citis.loadComplaintsFromFile();

        
            do{
            disp.Display1();
            disp.Display2();
            System.out.print("Enter a choice: ");
            try{
            choice = cs.nextInt();
            cs.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Integers number only please!!");
                cs.nextLine();
            }
            

            switch(choice){
                case 1: citis.registrationCitizens();
                break;
            
                case 2: 
                    User user = citis.citizenLoggedIn();
                    if (user != null) citis.citizenMenu(user);

                break;

                case 3:
                     Admin loggedInAdmin = admin.loginAdmin();
                    if (loggedInAdmin != null) {
                        admin.adminMenu(loggedInAdmin);
                    }
                break;

                case 4: 
                disp.AboutUs(); 
                break;
                case 5: 
                    System.out.println("Exiting system... Goodbye!");
                     citis.saveCitizensToFile();
                     citis.saveComplaintsToFile();
                    System.out.println("Data saved successfully. Goodbye!");
                    return;

                default: System.out.println("Invalid choice!");
            }
                
            
        }while(choice != 6);

    }

}

import java.util.Scanner;
import java.util.LinkedList;
import java.io.FileWriter;
import java.io.IOException;

public class Main4 {
    public static void main(String [] args){
        Scanner cs = new Scanner(System.in);
        LinkedList <String> names = new LinkedList<>();
        String name;
        String choice;

        do{
            System.out.print("Enter a names here: ");
            name = cs.nextLine();

            names.add(name);

            try(FileWriter writer = new FileWriter("Example1.txt")){
                for(String s: names){
                    writer.write(s);
                }
                System.out.println("The name has been added!!");
            }catch(IOException e){
                System.out.println("Couldn't write a file!!");
            }

        System.out.print("Do you still want to add?[Y/N]");
        choice = cs.nextLine();
        }while(choice.equals("Y")|| choice.equals("y"));




    }
}

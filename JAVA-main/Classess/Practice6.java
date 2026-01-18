import java.util.Scanner;
class Car{
    String name;
    int number;
    
    Car(String name1, int number2){
        name = name1;
        number = number2;
    }
    
    void Display(){
	System.out.println("Name: " + name);
	System.out.println("Number: " + number);
}
    
    
}
public class Practice6{
    public static void main(String [] args){
    Scanner cs = new Scanner(System.in);
    int count;
    
    System.out.print("How many names you will add?");
    count = cs.nextInt();
    cs.nextLine();
    
    Car [] cars = new Car[count];
    
    for(int i = 0; i < count; i++){
     System.out.println("\nFor student no. " + (i+1));
     System.out.print("Enter the name of your Car: ");
     String name1 = cs.nextLine();
     System.out.print("Serial number: ");
     int number2 = cs.nextInt();
     cs.nextLine();
     cars[i] = new Car(name1, number2);  
    }
    System.out.println("\n----------CARS-------------");
	for(Car car1 : cars){
	car1.Display();
	}
}
}

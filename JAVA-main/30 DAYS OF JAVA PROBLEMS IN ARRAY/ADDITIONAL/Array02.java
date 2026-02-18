//This is a triangle
//    *
//   ***
//  *****
// *******
//*********


package ADDITIONAL;

public class Array02 {
    public static void main(String[] args) {
        System.out.println("This is a Triangle");

        for(int i = 1; i <= 5;i++){
            for(int j = 1; j <= 5-i;j++){
                System.out.print(" ");
            }
                for(int k = 1; k < (i * 2 - 1);k++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    
}

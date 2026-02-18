// This is for inverted Pyramid
//*********
// *******
//  *****
//   ***
//    *

package ADDITIONAL;
public class Array03 {
    public static void main(String [] args){
        System.out.println("This is Invented Pyramid:");
        int f = 0;
        
        for(int i = 5; i >= 1; i--){
            for(int k = 1; k <= f;k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (i*2 - 1);j++){
                System.out.print("*");
            }
            System.out.println();
            f++;
        }
    }
}

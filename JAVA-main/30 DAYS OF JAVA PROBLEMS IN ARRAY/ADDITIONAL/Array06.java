//Right-Aligned Half Pyramid
//
//    *
//   **
//  ***
// ****
//*****
//
package ADDITIONAL;
class Array06 {
    public static void main(String[] args) {
        System.out.println("The Right-Aligned Half Pyramid!!\n");
        
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i;j++){
                System.out.print(" ");
            }
                for(int k = 1; k <=(i*2-k);k++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
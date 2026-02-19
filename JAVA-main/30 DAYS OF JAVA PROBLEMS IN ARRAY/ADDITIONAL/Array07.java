//Number Pyramid
//    1
//   121
//  12321
// 1234321
//123454321

package ADDITIONAL;
class Array07{
    public static void main(String [] args){
        System.out.println("Number Pyramid");
        
        for(int i = 1; i <=5; i++){
            for(int j = 1; j <= 5-i;j++){
                System.out.print(" ");
            }
                for(int k = 1; k <= (i*2 - i); k++){
                    System.out.print(k);
                }
                    for(int l = 1; l < i;l++){
                        System.out.print(i-l);
                    }
            System.out.println();
        }
    }
}
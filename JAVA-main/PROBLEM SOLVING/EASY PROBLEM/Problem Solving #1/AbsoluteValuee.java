// https://www.geeksforgeeks.org/dsa/program-to-find-absolute-value-of-a-given-number/
/*Given an integer N, The task is to find the absolute value of the given integer.

Examples: 



Input: N = -6 
Output: 6
Explanation: The absolute value of -6 is 6 which is non negative





Input: N = 12 
Output: 12 */

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = cs.nextInt();
        int ans = 0;
        
        if(num < 0){
            ans = num * -1;
        }else{
            ans = num * 1;
        }
        
        System.out.println(ans);
        
        
    }
}

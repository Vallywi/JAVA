package ADDITIONAL;
//reviewing HashSets
//Yoww

import java.util.HashSet;
public class Array08 {
    public static void main(String [] args){
        int [] nums = {2, 3, 4, 1, 5, 6};
        var prices = new HashSet<>();

        for(int s : nums){
            prices.add(s);
        }

        for(int i = 1; i <= 10; i++){
            if(prices.contains(i)){
                System.out.println("Yes the " + i + " contains in the HashSets!!");
            }
            else{
                System.out.println("The no." + i + " does not set in HashSets");
            }
        }
        
    }
}

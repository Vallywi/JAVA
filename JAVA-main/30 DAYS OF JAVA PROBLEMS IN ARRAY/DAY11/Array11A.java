//21.	Find missing number (0 to n)

package DAY11;
import java.util.*;

class Solution{
    ArrayList < Integer> missing (int [] nums){
        ArrayList <Integer> ahm = new ArrayList<>();
        int kumo = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = kumo; j < nums[i]; j++){
                if(nums[i] != kumo){
                    ahm.add(kumo);
                    kumo++;
                }
            }
            kumo++;
        }
        return ahm;
        
    }
}
public class Array11A{
    public static void main(String [] args){
        int [] nums = {0, 2, 3, 1, 6, 10, 9, 11, 14, 31};
        Arrays.sort(nums);

        
        Solution sol = new Solution();
        ArrayList <Integer> result = sol.missing(nums);
        
        for(int s : result){
            System.out.println(s);
        }
    }
}

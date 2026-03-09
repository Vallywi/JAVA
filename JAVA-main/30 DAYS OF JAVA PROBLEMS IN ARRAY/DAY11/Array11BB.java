// find the duplicate nums (Hashing)
// nums = [1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8,10, 10, 9]
// expected output : 2 4 5 10

package DAY11;
import java.util.*;
class Solution{
    HashSet <Integer> duplicas (int [] nums){
        HashSet <Integer> yes = new HashSet<>();
        HashSet <Integer> no = new HashSet <>();
        
        for(int i = 0; i < nums.length;i++){
            if(yes.contains(nums[i])){
                no.add(nums[i]);
            }
            yes.add(nums[i]);
        }
        return no;
         
    }
    
}
public class Array11BB{
    public static void main(String [] args){
        int [] nums = {1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8,10, 10, 9};
        
        Solution sol = new Solution();
        HashSet <Integer> result = sol.duplicas(nums);
        
        for(int s : result){
            System.out.print(s + " ");
        }
        
    }
}

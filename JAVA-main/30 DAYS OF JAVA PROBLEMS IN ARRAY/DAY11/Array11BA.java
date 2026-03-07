// find the duplicate nums (Hashmap)
// nums = [1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8,10, 10, 9]
// expected output : 2 4 5 10

import java.util.*;

class Solution{
    public HashMap <Integer, Integer> Duplicas(int [] nums){
        HashMap <Integer, Integer> map = new HashMap<>();
        HashMap <Integer, Integer> duplia = new HashMap <>();
        
        for(int i = 0; i < nums.length;i++){
            if(map.containsKey(nums[i])){
                duplia.put(nums[i], i);
            }
            map.put(nums[i], i);
        }
        return duplia;
    }
}

public class Array11BA{
    public static void main(String [] args){
        int [] nums = {1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8,10, 10, 9};
        
        Solution sol = new Solution();
        HashMap <Integer, Integer> result = sol.Duplicas(nums);
        
        for(int s: result.keySet()){
            System.out.print(s + " ");
        }
    }
}

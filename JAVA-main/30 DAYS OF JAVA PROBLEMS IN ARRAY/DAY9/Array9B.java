// INT [] NUMS = [7, 1, 2, 5, 4, 9, 10, 11, 11]
//OUTPUT SHOULD BE THE INDEXES

import java.util.*;

class Solution{
    public HashMap <Integer, Integer> Targeter(int [] nums, int target){
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            if(map1.containsKey(target-nums[i])){
                map2.put(nums[i], map1.get(target-nums[i]));
            }
            map1.put(nums[i], i);
        }
        return map2;
        
    }
}
public class Array9B{
    public static void main(String [] args){
        int [] nums = {7, 1, 2, 5, 4, 9, 10, 11, 11};
        int target = 9;
        
        Solution sol = new Solution();
        HashMap <Integer, Integer> result = sol.Targeter(nums, target);
        
        for(int s : result.keySet()){
            System.out.println(result.get(s) + " " + s);
        }
        
    }
}
package DAY10;
//Count frequency of each element
// [2, 3, 5, 10, 6, 1, 1, 1, 2, 4, 10]

// 2 => 2
// 1 => 3
// 3 => 1
// 4 => 1
// 5 => 1
// 6 => 1
// 10 => 1

import java.util.*;
class Solution{
    public HashMap <Integer, Integer> counter (int [] nums){
        HashMap<Integer, Integer> map1 = new HashMap<>();
        
        for(int i = 0; i < nums.length;i++){
            if(map1.containsKey(nums[i])){
                int currentcount = map1.get(nums[i]);
                map1.put(nums[i], currentcount + 1);
            }else{
                map1.put(nums[i], 1);
            }
        }
        return map1;
    }
    
}


public class Array10{
    public static void main(String [] args){
        int [] nums = {2, 3, 5, 10, 6, 1, 1, 1, 2, 4, 10};
        Solution sol = new Solution();
        
        HashMap <Integer, Integer> result = sol.counter(nums);
        
        for(int s: result.keySet()){
            System.out.println(result.get(s) + " => " + s);
        }
        
    }
}
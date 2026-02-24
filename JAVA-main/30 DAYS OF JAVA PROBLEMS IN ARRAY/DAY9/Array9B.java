//Find all pairs that sum to a target (optimized)
// using the hashmaps

//[4, 2, 3, 5, 7, 9, 10, 14, 20]
//target =9;

import java.util.*;
class Solution{
        public static List<int[]> twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<>();
        List<int[]> pairs = new ArrayList<>();
    

        for(int i = 0; i < nums.length;i++){
            int need = target - nums[i];
            
            if(map.containsKey(need)){
                pairs.add(new int [] {need, nums[i]});
            }
            map.put(nums[i], i);
        }
        return pairs;
    }
}


class Array9B{
    public static void main(String [] args){
        int [] nums = {4, 2, 3, 5, 7, 9, 10, 14, 20};
        int target = 9;
        Solution sol = new Solution();
        List <int[]> answer = sol.twoSum(nums, target);
        for(int[] pair : answer){
            System.out.println(pair[0] + " + " + pair[1]);
        }
        
    }
}
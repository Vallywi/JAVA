package DAY10;
//Count frequency of each element
// [2, 2, 1, 3, 4, 5, 6, 7, 7]

// 2 => 2
// 1 => 1
// 3 => 1
// 4 => 1
// 5 => 1
// 6 => 1
// 7 => 2

import java.util.*;
class Solution{
    public HashMap<Integer, List<Integer>> frequent(int [] nums){
        HashMap <Integer, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < nums.length;i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add((1)+1);
        }
        return map;
    }
}


public class Array10 {
    public static void main(String[] args) {
        int [] nums = {2, 2, 1, 3, 4, 5, 6, 7, 7};
        Solution sol = new Solution();
        HashMap<Integer, List<Integer>> result = sol.frequent(nums);

        for(int answer : result.keySet()){
            System.out.println(answer + " => " + result.get(answer));
        }
    }
}

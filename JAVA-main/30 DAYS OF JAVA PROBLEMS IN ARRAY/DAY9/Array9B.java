//this is with the use of optimization


package DAY9;

import java.util.*;
public class Array9B{
    public static void main(String [] args){
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int [] nums = {7, 1, 2, 5, 4, 9, 10, 11, 11};
        int target = 9;
        
        for(int i = 0; i < nums.length;i++){
            if(map1.containsKey(target-nums[i])){
                map2.put(nums[i], map1.get(target-nums[i]));
            }
            map1.put(nums[i], i);
        }
        
        for(int s : map2.keySet()){
            System.out.println(map2.get(s) + " " + s);
        }
        
        
    }
}
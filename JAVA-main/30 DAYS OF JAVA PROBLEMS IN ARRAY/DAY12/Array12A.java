package DAY12;
//Kadane’s algorithm — max subarray sum
// [-2, -3, 4, -1, -2, 1, 5, -3]
// max = 7;
// max
//yess
//final na hehehe
//hindi pa pala

class Solution{
    public int subbarray(int [] nums){
        int currentsub = 0;
        int subcha = 0;
        
        for(int i = 0; i < nums.length;i++){
            subcha+=nums[i];
            
            if(subcha > currentsub){
                currentsub = subcha;
            }
            
            if(subcha < 0){
                subcha = 0;
            }
        }
        return currentsub;
    }
}

public class Array12A{
    public static void main(String [] args){
        int [] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        Solution sol = new Solution();
        int result = sol.subbarray(nums);
        System.out.println(result);
    }
}
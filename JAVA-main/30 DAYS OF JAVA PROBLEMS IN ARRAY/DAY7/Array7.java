package DAY7;
//8.	Rotate an array to the right by one position
// [3, 4, 10, 9, 8, 4, 1, 23];
// [23, 3, 4, 10, 9, 8, 4, 1];

class Solution{
    int [] left(int [] nums, int first){
        
        for(int i = nums.length-1; i > 0; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = first;
        return nums;
    }
}


public class Array7{
    public static void main(String [] args){
        int [] nums = {3, 4, 10, 9, 8, 4, 1, 23};
        int first = nums[nums.length-1];
        
        Solution sol = new Solution();
        int [] result = sol.left(nums, first);
        
        for(int s : result){
            System.out.print(s + " ");
        }
        
    }
}
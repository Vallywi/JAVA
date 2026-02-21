//Rotate array by K steps (left rotation)
//[1, 2, 4, 6, 5, 3, 9, 10, 45, 21]
// Left rotation
// Expected Output:
//[6, 5, 3, 9, 10, 45, 21, 1, 2, 4]
package DAY8;
class Solution{
    public void rotateArray(int [] nums,int k){
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, (nums.length-1)-k);
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

public class Array8B{
    public static void main(String [] args){
        int [] nums = {1, 2, 4, 6, 5, 3, 9, 10, 45, 21, 42, 20, 100};
        int k = 3;
        
        Solution sol = new Solution();
        sol.rotateArray(nums, k);
        
        for(int s : nums){
            System.out.print(s + " ");
        }
        
    }
}
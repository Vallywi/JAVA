//Rotate array by K steps (right rotation)
//Well this is the easiest code and shortest time and space complexity that we can use
//[2, 3, 5, 7, 9, 1, 10, 13]
// k = 3;

package DAY8;
class Solution{
    public void rotate(int [] nums, int k){
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length);
    
    }

    public void reverse(int [] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

public class Array8A {
    public static void main(String[] args) {
        int [] nums = {2, 3, 5, 7, 9, 1, 10, 13};
        int k = 3;
        Solution sol = new Solution();
            sol.rotate(nums, k);
    }

}

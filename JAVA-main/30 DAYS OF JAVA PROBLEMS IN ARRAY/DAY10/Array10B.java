// 20.	Check if two arrays are equal by value
// int nums1 [2, 3, 1, 1, 4, 5, 6]
// int nums2 [2, 3, 1, 1, 5, 4, 6]
// If they are equal = True
// If they are not equal = False

package DAY10;
import java.util.*;

class Solution{
    public boolean sorter(int [] nums1, int [] nums2){
        if(nums1.length != nums2.length){
            return false;
        }
        
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] != nums2[i]){
                return false;
            }
        }
        return true;
    }
}

public class Array10B{
    public static void main(String [] args){
        int [] nums1 = {2, 3, 1, 1, 4, 5, 6};
        int [] nums2 = {2, 3, 1, 1, 5, 4, 6};
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        Solution sol = new Solution();
        boolean result = sol.sorter(nums1, nums2);
        
        System.out.println(result);
        
    }
}
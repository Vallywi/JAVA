//Find all pairs that sum to a target
// [4, 2, 3, 5, 7, 9, 10, 14, 20];
//target : 14

class Solution{
	public void pairing(int [] nums, int target){
	for(int i = 0; i < nums.length-1; i++){
		for(int j = i + 1; j < nums.length;j++){
		if(nums [i] + nums[j] == target){
		System.out.println("[" + nums[i] + " , " + nums[j] + "]");
		}
	}
	}
}
}

public class Array9A{
        public static void main(String [] args){
     	 int [ ] nums = {4, 2, 3, 5, 7, 9, 10, 14, 20};
    	 int target = 14;
   	
      Solution sol = new Solution();
      sol.pairing(nums, target);
}
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            int x = nums[left] + nums[right];
             if(x > target) right--;
             else if(x < target) left++;
             else{
                int[] ans = {left + 1, right + 1};
                return ans;
             }
        } 
        return new int[] {-1,-1};       
    }
}
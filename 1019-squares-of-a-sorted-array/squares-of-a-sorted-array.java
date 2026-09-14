class Solution {
    public int[] sortedSquares(int[] nums) {
       int left=0,right=nums.length-1;
       int []arr=  new int[nums.length];
       int a=right;
       while(left<=right){
        int square_l=nums[left]*nums[left];
        int square_r=nums[right]*nums[right];
        if(square_r>square_l){
            arr[a]=square_r;
            right--;
        }
        else {
            arr[a]=square_l;
            left++;
        }
        a--;
       }
       return arr;
       
}};
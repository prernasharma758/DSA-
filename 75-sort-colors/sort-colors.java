class Solution {
    public void sortColors(int[] nums) {
        int zeros =0,one =0,two=0;
        int k=0;
        for(int x:nums){
            if(x==0) zeros++;
            else if(x==1) one++;
            else two++;
        }
        for(int i=1;i<=zeros;i++){
            nums[k]=0;
            k++;
        }
        for(int i=1;i<=one;i++){
            nums[k]=1;
            k++;
        }
        for(int i=1;i<=two;i++){
            nums[k]=2;
            k++;
        }
        
    }
}
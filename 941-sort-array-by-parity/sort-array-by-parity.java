class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                int a = arr[left];
                arr[left] = arr[right];
                arr[right] = a;

                left++;
                right--;
         }
             if (arr[left]%2==0) {
             left++;
     }
             if (arr[right]%2!=0) {
             right--;
            }
        }
    return arr;
    }
}
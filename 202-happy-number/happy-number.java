class Solution {
    public int sumofsquares(int n){
        int sum=0;
        while(n!=0){
            int digit = n % 10;
            sum+= digit*digit;
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        while(n!=1 && n!=37){
            n = sumofsquares(n);
        }
        return n == 1;
    }
}

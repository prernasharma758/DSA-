class Solution {
    public int countDigits(int n) {
        int count = 0;
        int x = n;
        while (n != 0) {
        int digit = n % 10;
        if (x%digit== 0) 
       count++;
        n = n/10;
      }
        return count;
        }
    }

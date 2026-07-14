// Last updated: 7/14/2026, 2:01:34 PM
class Solution {
    public int reverse(int x) {
        int n=0;
        while(x!=0){
            int temp=x%10;
            x=x/10;
            if(n > Integer.MAX_VALUE/10|| n <Integer.MIN_VALUE/10){
                return 0;
            }
            n=n*10+temp;
        }
        return n;
    }
}
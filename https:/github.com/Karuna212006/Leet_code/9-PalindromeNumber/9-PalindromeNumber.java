// Last updated: 7/14/2026, 2:01:30 PM
class Solution {
    public boolean isPalindrome(int x) {
        int n=0;
        int m=x;
        String st=String.valueOf(x);
        if(st.charAt(0)=='-')return false;
        while(x!=0){
            int t=x%10;
            x=x/10;
            n=n*10+t;
        }
            if(n != m){                
             return false;
        }
        

      return m==n;
    }
}
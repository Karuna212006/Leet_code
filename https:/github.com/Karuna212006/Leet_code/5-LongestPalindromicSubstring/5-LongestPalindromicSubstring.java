// Last updated: 7/14/2026, 2:01:37 PM
class Solution {
    public boolean isPalin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
            return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String LongPalin="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String str=s.substring(i,j);

            if(isPalin(str)){
                if(LongPalin.length() < str.length()){
                       LongPalin=str;
                }
              }
            }
        }
        return LongPalin;
    }
}
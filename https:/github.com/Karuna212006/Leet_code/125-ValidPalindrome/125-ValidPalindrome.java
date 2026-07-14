// Last updated: 7/14/2026, 2:00:26 PM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String a="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<= 'z' || ch>=48 && ch<=57){
                    a+=ch;
            }

        }
        int i=0;
        int j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}
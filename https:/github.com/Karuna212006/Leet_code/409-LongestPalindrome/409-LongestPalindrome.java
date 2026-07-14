// Last updated: 7/14/2026, 1:59:13 PM
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(char ch:s.toCharArray()){
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        int length=0;
        boolean res=false;

        for(int count : hmap.values()){
            if(count%2==0){
                length+=count;
            }else{
                length+=count-1;
                res=true;
            }
        }
        if(res){
            length++;
        }
        return length;
    }
}
// Last updated: 7/14/2026, 2:01:25 PM
class Solution {
    public int interval(char ch){
        if(ch=='I')return 1;
        else if(ch=='V')return 5;
        else if(ch=='X')return 10;
        else if(ch=='L')return 50;
        else if(ch=='C')return 100;
        else if(ch=='D')return 500;
        else if(ch=='M')return 1000;
        else return 0;
    }
    public int romanToInt(String s) {
       int sum=0;
       int i;
       for( i=0;i<s.length()-1;i++){
        if(interval (s.charAt(i)) >= interval (s.charAt(i+1))){
            sum+=interval(s.charAt(i));
        }else{
            sum+= interval(s.charAt(i+1)) - interval(s.charAt(i));
            i++;
        }
       } 
       if(i !=s.length()) sum+=interval(s.charAt(i));
       return sum;  
    }
}
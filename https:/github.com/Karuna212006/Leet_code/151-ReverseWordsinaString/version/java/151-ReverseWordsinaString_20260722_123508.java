// Last updated: 7/22/2026, 12:35:08 PM
1class Solution {
2    public String reverseWords(String s) {
3        String st=s.trim().replaceAll("\\s+"," ");
4        String [] arr=st.split(" ");
5        int n=arr.length-1;
6        String rev="";
7        for(int i=n;i>=0;i--){
8            rev+=arr[i];
9            rev+=" ";
10        }
11    return rev.trim();
12    }
13}
// Last updated: 7/14/2026, 2:01:24 PM
class Solution {
     public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);  

        String strsf = strs[0];                   
        String strsl = strs[strs.length - 1];     

        StringBuilder prefix = new StringBuilder();

        int i = 0;

        while (i < strsf.length() && i < strsl.length()) {
            if (strsf.charAt(i) == strsl.charAt(i)) {
                prefix.append(strsf.charAt(i));   
                i++;
            } else {
                break;  
            }
        }

        return prefix.toString();   
    
     }
}
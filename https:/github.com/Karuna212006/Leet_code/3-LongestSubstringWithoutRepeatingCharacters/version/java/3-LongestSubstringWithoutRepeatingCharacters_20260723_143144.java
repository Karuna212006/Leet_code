// Last updated: 7/23/2026, 2:31:44 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int[] lastSeen = new int[128]; // ASCII table
4        int left = 0, maxLen = 0;
5        
6        for (int right = 0; right < s.length(); right++) {
7            char c = s.charAt(right);
8            left = Math.max(left, lastSeen[c]); // lastSeen[c] is 0 by default
9            maxLen = Math.max(maxLen, right - left + 1);
10            lastSeen[c] = right + 1; // Store (index + 1) so 0 means "never seen"
11        }
12        
13        return maxLen;
14    }
15}
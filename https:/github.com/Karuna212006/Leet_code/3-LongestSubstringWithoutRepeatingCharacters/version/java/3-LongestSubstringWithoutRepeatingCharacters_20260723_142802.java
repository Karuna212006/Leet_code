// Last updated: 7/23/2026, 2:28:02 PM
1import java.util.HashSet;
2
3class Solution {
4    public int lengthOfLongestSubstring(String s) {
5
6        HashSet<Character> set = new HashSet<>();
7
8        int left = 0;
9        int maxLen = 0;
10
11        for (int right = 0; right < s.length(); right++) {
12
13            while (set.contains(s.charAt(right))) {
14                set.remove(s.charAt(left));
15                left++;
16            }
17
18            set.add(s.charAt(right));
19
20            maxLen = Math.max(maxLen, right - left + 1);
21        }
22
23        return maxLen;
24    }
25}
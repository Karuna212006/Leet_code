// Last updated: 7/14/2026, 1:59:17 PM
class Solution {
    public char findTheDifference(String s, String t) {

        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            int countInS = 0;
            int countInT = 0;

            // count occurrences of c in s
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    countInS++;
                }
            }

            // count occurrences of c in t
            for (int k = 0; k < t.length(); k++) {
                if (t.charAt(k) == c) {
                    countInT++;
                }
            }

            // if t has extra occurrence, that is the answer
            if (countInT > countInS) {
                return c;
            }
        }

        return ' '; 
    }
}
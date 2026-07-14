// Last updated: 7/14/2026, 1:58:28 PM
class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();

        // Step 1: compute total score of the entire string
        int total = 0;
        for (char c : s.toCharArray()) {
            total += (c - 'a' + 1);
        }

        // Step 2: try splitting at each possible index
        int leftScore = 0;
        int rightScore = total;

        // split positions: after index 0 up to after index n-2
        for (int i = 0; i < n - 1; i++) {
            int value = s.charAt(i) - 'a' + 1;

            leftScore += value;
            rightScore -= value;

            if (leftScore == rightScore) {
                return true;
            }
        }

        return false;
    
    }
}
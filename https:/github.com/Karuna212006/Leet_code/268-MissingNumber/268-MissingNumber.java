// Last updated: 7/14/2026, 1:59:36 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            n += i - nums[i];
        }
        
        return n;       
    }
}
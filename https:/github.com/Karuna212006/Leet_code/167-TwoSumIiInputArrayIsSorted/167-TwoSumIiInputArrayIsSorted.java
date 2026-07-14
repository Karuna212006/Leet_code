// Last updated: 7/14/2026, 2:00:09 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target)
                return new int[] {left + 1, right + 1}; 
            else if (sum < target)
                left++;
            else
                right--;
        }

        return new int[] {-1, -1}; 
    }
    
}
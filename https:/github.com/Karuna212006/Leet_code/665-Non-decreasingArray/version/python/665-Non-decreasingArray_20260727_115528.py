# Last updated: 7/27/2026, 11:55:28 AM
1class Solution:
2    def checkPossibility(self, nums: List[int]) -> bool:
3        vol = 0
4        for i in range(len(nums) - 1):
5            if nums[i] > nums[i + 1]:       # Only when there's a violation
6                vol += 1
7                if vol > 1:
8                    return False
9                
10                # Fix logic ONLY runs when there's a violation ✅
11                if i == 0 or nums[i - 1] <= nums[i + 1]:
12                    nums[i] = nums[i + 1]    # Option A: Lower nums[i]
13                else:
14                    nums[i + 1] = nums[i]    # Option B: Raise nums[i+1]
15                    
16        return True
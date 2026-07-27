# Last updated: 7/27/2026, 12:01:12 PM
1class Solution:
2    def checkPossibility(self, nums: List[int]) -> bool:
3        vol = 0
4        for i in range(len(nums) - 1):
5            if nums[i] > nums[i + 1]:       
6                vol += 1
7                if vol > 1:
8                    return False
9                
10                if i == 0 or nums[i - 1] <= nums[i + 1]:
11                    nums[i] = nums[i + 1]    
12                else:
13                    nums[i + 1] = nums[i]    
14                    
15        return True
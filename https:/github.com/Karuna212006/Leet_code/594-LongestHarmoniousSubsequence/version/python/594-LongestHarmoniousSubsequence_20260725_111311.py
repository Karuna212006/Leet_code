# Last updated: 7/25/2026, 11:13:11 AM
1from typing import List
2
3class Solution:
4    def findLHS(self, nums: List[int]) -> int:
5        nums.sort()
6        left = 0
7        max_len = 0
8        for right in range(len(nums)):
9            
10            while nums[right] - nums[left] > 1:
11                left += 1
12            if nums[right] - nums[left] == 1:
13                max_len = max(max_len, right - left + 1)
14                
15        return max_len
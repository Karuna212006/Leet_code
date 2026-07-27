# Last updated: 7/27/2026, 9:33:38 AM
1class Solution:
2    def longestOnes(self, nums: List[int], k: int) -> int:
3        zero,max_len,left=0,0,0
4        for right in range(len(nums)):
5            if(nums[right]==0):
6                zero+=1
7            if zero > k:
8                if nums[left]==0:
9                    zero-=1
10                left+=1
11            max_len=max(max_len,right-left+1)
12        return max_len
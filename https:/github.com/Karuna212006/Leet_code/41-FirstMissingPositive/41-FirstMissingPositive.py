# Last updated: 7/14/2026, 2:01:04 PM
class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        s=set(nums)
        ans=1
        while ans in s:
            ans+=1
        return ans
# Last updated: 7/14/2026, 1:59:02 PM
class Solution:
    def minMoves(self, nums: List[int]) -> int:
        Min=min(nums)
        count=0
        for i in nums:
            count +=i-Min
        return count
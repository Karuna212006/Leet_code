# Last updated: 7/14/2026, 2:00:25 PM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        res=0
        for num in nums:
            res^=num
        return res
            
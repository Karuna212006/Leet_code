# Last updated: 7/14/2026, 2:00:58 PM
class Solution:
    def canJump(self, nums: List[int]) -> bool:
        f=len(nums)-1
        for i in range(len(nums)-2,-1,-1):
            if nums[i]+i>=f:
                    f=i
        if f==0:
            return True
        else:
            return False

           
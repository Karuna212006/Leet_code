# Last updated: 7/14/2026, 1:59:47 PM
class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums)==1:
            return nums[0]
        def robber1(nums):
            n=len(nums)
            if(n==1):
                return nums[0]
            dp=[0]*n
            dp[0]=nums[0]
            dp[1]=max(nums[0],nums[1])
            for i in range(2,n):
                dp[i]=max(nums[i]+dp[i-2],dp[i-1])
            return dp[-1]
        nums1=nums[1:len(nums)]
        nums2=nums[0:-1]
        m1=robber1(nums1)
        m2=robber1(nums2)
        return max(m1,m2)
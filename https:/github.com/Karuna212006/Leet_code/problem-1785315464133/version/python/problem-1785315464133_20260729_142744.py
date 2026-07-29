# Last updated: 7/29/2026, 2:27:44 PM
1class Solution:
2    def findMaxAverage(self, nums: List[int], k: int) -> float:
3        window_sum=sum(nums[:k])
4        max_sum=window_sum
5
6        for i in range(k,len(nums)):
7            window_sum+=nums[i]-nums[i-k]
8            max_sum = max(max_sum,window_sum)
9        return max_sum / k
10                
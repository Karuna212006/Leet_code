# Last updated: 7/29/2026, 12:17:29 PM
1class Solution:
2    def findMaxLength(self, nums: List[int]) -> int:
3        prefix_map={0:-1}
4
5        max_len=0
6        prefix_sum=0
7
8        for i,num in enumerate(nums):
9            prefix_sum += 1 if num == 1 else -1
10
11            if prefix_sum in prefix_map:
12                # We've seen this sum before → subarray sum = 0
13                max_len = max(max_len, i - prefix_map[prefix_sum])
14            else:
15                prefix_map[prefix_sum] = i
16        return max_len
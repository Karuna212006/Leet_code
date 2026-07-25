# Last updated: 7/25/2026, 1:48:36 PM
1class Solution:
2    def maxDistance(self, arr: List[List[int]]) -> int:
3        min_val=arr[0][0]
4        max_val=arr[0][-1]
5        result=0
6        for i in range(1,len(arr)):
7            curr_max=arr[i][-1]
8            curr_min=arr[i][0]
9
10            result=max(
11                result,
12                curr_max-min_val,
13                max_val-curr_min
14                )
15            min_val = min(min_val, curr_min)
16            max_val = max(max_val, curr_max)
17
18        return result
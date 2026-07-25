# Last updated: 7/25/2026, 2:19:06 PM
class Solution:
    def maxDistance(self, arr: List[List[int]]) -> int:
        min_val=arr[0][0]
        max_val=arr[0][-1]
        result=0
        for i in range(1,len(arr)):
            curr_max=arr[i][-1]
            curr_min=arr[i][0]

            result=max(
                result,
                curr_max-min_val,
                max_val-curr_min
                )
            min_val = min(min_val, curr_min)
            max_val = max(max_val, curr_max)

        return result
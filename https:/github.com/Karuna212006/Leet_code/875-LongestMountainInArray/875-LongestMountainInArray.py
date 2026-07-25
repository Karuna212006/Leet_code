# Last updated: 7/25/2026, 2:19:01 PM
class Solution:
    def longestMountain(self, arr: List[int]) -> int:
        n=len(arr)
        max_len=0
        up=0
        down=0

        for i in range(1,n):
            if arr[i]>arr[i-1]:
                if down > 0:
                    down=0
                    up=0
                up+=1
            elif arr[i]<arr[i-1]:
                down+=1
            else:
                up=0
                down=0
            if up > 0 and down > 0:
                max_len=max(max_len,up+down+1)
        return max_len
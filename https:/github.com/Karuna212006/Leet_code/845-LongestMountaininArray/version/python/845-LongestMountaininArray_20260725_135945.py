# Last updated: 7/25/2026, 1:59:45 PM
1class Solution:
2    def longestMountain(self, arr: List[int]) -> int:
3        n=len(arr)
4        max_len=0
5        up=0
6        down=0
7
8        for i in range(1,n):
9            if arr[i]>arr[i-1]:
10                if down > 0:
11                    down=0
12                    up=0
13                up+=1
14            elif arr[i]<arr[i-1]:
15                down+=1
16            else:
17                up=0
18                down=0
19            if up > 0 and down > 0:
20                max_len=max(max_len,up+down+1)
21        return max_len
# Last updated: 7/22/2026, 12:03:35 PM
1class Solution:
2    def reverseWords(self, s: str) -> str:
3        arr=s.split()
4        for i in arr:
5            return " ".join(arr[::-1])
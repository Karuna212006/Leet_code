# Last updated: 7/20/2026, 11:54:08 AM
1class Solution:
2    def minDistance(self, word1: str, word2: str) -> int:
3        n=len(word1)
4        m=len(word2)
5        dp=[[0] * (n + 1) for _ in range(m + 1)]
6        for i in range(1,m+1):
7            for j in range(1,n+1):
8                if word2[i-1]==word1[j-1]:
9                    dp[i][j]=dp[i-1][j-1]+1
10                else:
11                    dp[i][j]=max(dp[i-1][j],dp[i][j-1])
12        lcs_len=dp[m][n]
13        return m+n-2*lcs_len
14        
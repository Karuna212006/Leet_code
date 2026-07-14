# Last updated: 7/14/2026, 1:59:01 PM
class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        arr=[]
        s=s.replace("-","").upper()
        rem=len(s)%k
        if rem>0:
            arr.append(s[:rem])
        for i in range(rem,len(s),k):
            arr.append(s[i:i+k])
        return "-".join(arr)
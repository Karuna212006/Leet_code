# Last updated: 7/29/2026, 11:37:37 AM
1from typing import List
2
3class Solution:
4    def wordSubsets(self, words1: List[str], words2: List[str]) -> List[str]:
5        max_freq = [0] * 26
6        
7        for word in words2:
8            freq = [0] * 26
9            for c in word:
10                freq[ord(c) - ord('a')] += 1
11            for i in range(26):
12                max_freq[i] = max(max_freq[i], freq[i])
13        
14        result = []
15        for word in words1:
16            freq = [0] * 26
17            for c in word:
18                freq[ord(c) - ord('a')] += 1
19            
20            if all(freq[i] >= max_freq[i] for i in range(26)):
21                result.append(word)
22        
23        return result
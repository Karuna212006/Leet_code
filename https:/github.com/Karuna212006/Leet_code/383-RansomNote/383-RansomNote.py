# Last updated: 7/14/2026, 1:59:20 PM
class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:

        freq = {}

        # Count characters in magazine
        for ch in magazine:
            freq[ch] = freq.get(ch, 0) + 1

        # Use characters for ransomNote
        for ch in ransomNote:
            if ch not in freq or freq[ch] == 0:
                return False
            freq[ch] -= 1

        return True
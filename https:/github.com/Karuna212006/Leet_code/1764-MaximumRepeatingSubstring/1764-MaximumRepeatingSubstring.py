# Last updated: 7/14/2026, 1:58:36 PM
class Solution:
    def maxRepeating(self, sequence: str, word: str) -> int:
        count = 0
        repeat = word

        while repeat in sequence:
            count += 1
            repeat += word

        return count
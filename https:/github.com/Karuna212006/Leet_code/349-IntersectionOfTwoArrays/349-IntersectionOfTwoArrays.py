# Last updated: 7/14/2026, 1:59:25 PM
class Solution(object):
    def intersection(self, nums1, nums2):
        return list(set(nums1)&set(nums2))
        
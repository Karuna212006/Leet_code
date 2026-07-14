# Last updated: 7/14/2026, 2:00:47 PM
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        curr=head
        while(curr!= None and curr.next!= None):
            if(curr.val==curr.next.val):
                curr.next=curr.next.next
            else:
                curr=curr.next
        return head
// Last updated: 7/14/2026, 1:59:39 PM
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
         node.next=node.next.next;
    }
}
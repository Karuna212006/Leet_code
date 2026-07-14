// Last updated: 7/14/2026, 2:00:39 PM
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode tempHead = new ListNode(0);
        tempHead.next = head;
        ListNode beforeRev = tempHead;

        for (int i = 1; i < left; i++) {
            beforeRev = beforeRev.next;
        }

        ListNode startNode = beforeRev.next;
        ListNode nextNode = startNode.next;

        for (int i = 0; i < right - left; i++) {
            startNode.next = nextNode.next;
            nextNode.next = beforeRev.next;
            beforeRev.next = nextNode;
            nextNode = startNode.next;
        }

        return tempHead.next;
    }
}

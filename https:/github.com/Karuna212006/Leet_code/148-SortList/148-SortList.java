// Last updated: 7/14/2026, 2:00:13 PM
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
  
        ListNode mid = getMiddle(head);
        ListNode left = sortList(head);    
        ListNode right = sortList(mid);    

        return mergeSortedLists(left, right);
    }

    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) prev.next = null;

        return slow;
    }

    private ListNode mergeSortedLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        
        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return dummy.next;
    }
}

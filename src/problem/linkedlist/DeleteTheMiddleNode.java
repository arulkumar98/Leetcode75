package problem.linkedlist;

public class DeleteTheMiddleNode {
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }
        ListNode prev = null;
        ListNode middle = head;
        ListNode last = head;

        while (last != null && last.next!= null){
            prev = middle;
            middle = middle.next;
            last = last.next.next;
        }

        if (middle.next != null) {
            prev.next = middle.next;
            middle.next = null;
        }
        System.gc();
        return head;
    }
}

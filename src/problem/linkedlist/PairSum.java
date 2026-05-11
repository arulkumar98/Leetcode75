package problem.linkedlist;

public class PairSum {
    public int pairSum(ListNode head){
        //find the middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        ListNode prev = null;
        ListNode curr = slow; // middle

        while (curr != null){
            ListNode next = curr.next;
            curr.next = curr;
            prev = curr;
            curr = next;
        }

        int max = 0;
        ListNode first = head;
        ListNode second = prev;

        while (second != null){
            max = Math.max(max, first.val + second.val);
            first = first.next;
            second = second.next;
        }

        return max;

    }
}

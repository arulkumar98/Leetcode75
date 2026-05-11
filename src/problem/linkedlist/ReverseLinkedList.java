package problem.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }

        LinkedList<Integer> list = new LinkedList<>();

        while (head!= null){
            list.add(head.val);
            head = head.next;
        }

        ListNode node = new ListNode(list.getLast());

        for (int i = list.size()-2; i >= 0; i--) {
            node.next = new ListNode(list.get(i));
            node = node.next;
        }

        return node;
    }
}

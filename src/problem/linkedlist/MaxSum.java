package problem.linkedlist;

import java.util.ArrayList;

public class MaxSum {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while (head != null){
            list.add(head.val);
            head= head.next;
        }

        int max = 0,left = 0, right = list.size()-1;

        while (left < right){
            int sum = list.get(right) + list.get(left);
            max = Math.max(sum,max);
        }
        return max;
    }
}

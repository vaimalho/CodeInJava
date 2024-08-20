package linkedlist.lec3;

import java.util.HashSet;
import java.util.Set;

public class DetectALoopInLLMain {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(){
            this.data = 0;
            this.next = null;
        }
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

    }

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static boolean hasCycle(ListNode head) {

        if(head == null || head.next == null)
            return false;

        Set<ListNode> set = new HashSet<>();
        ListNode curr = head;

        while(curr != null){
            if(set.contains(curr))
                return true;
            set.add(curr);
            curr = curr.next;
        }
        return false;
    }

    // Time Complexity: O(N)
    // Space Complexity : O(1)
    public static boolean hasCycle_Optimized(ListNode head) {

        if(head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
}

import java.util.LinkedList;

public class DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(prev != null){
            prev.next = slow.next;
        }

        return head;
    }
}


public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1 == null && head2 == null){
            return null;
        }
        ListNode mergedList;
        ListNode mergedListHead = null;
        ListNode currentNode1 = head1;
        ListNode currentNode2 = head2;
        if(head1.val > head2.val){
            mergedList = head2;
            currentNode2 = currentNode2.next;
            mergedListHead = mergedList;
        } else {
            mergedList = head1;
            currentNode1 = currentNode1.next;
        }


        while (head1.next != null && head2.next != null){
            if(currentNode1.val > currentNode2.val){
                mergedList.next = currentNode2;
                currentNode2 = currentNode2.next;
                mergedList = mergedList.next;
            } else {
                mergedList.next = currentNode1;
                currentNode1 = currentNode1.next;
                mergedList = mergedList.next;
            }
        }
        return mergedListHead;
    }
}
//1, 3, 5, 7
//2, 4, 6
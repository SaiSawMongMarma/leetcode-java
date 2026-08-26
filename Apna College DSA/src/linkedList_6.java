//Questions for placement
//Find the nth node from the end & remove it.
//size-n+1(dfs)

//palindrome-BOB,1221,141

//19. Remove Nth Node From End of List
//Questions for placement
//Find the nth node from the end & remove it.
//size-n+1(dfs)

import java.util.LinkedList;
public class linkedList_6  {

    //    creating node first
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // 1. If there is only one node
        if (head.next == null) {
            return null;
        }

        // 2. Calculate the size of the linked list
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // 3. If we have to remove the first node
        if (n == size) {
            return head.next;
        }

        // 4. Find the node just before the node to remove
        int ptf = size - n;

        ListNode prev = head;
        int cp = 1;

        while (cp != ptf) {
            prev = prev.next;
            cp++;
        }

        // 5. Remove the node
        prev.next = prev.next.next;

        return head;
    }
}

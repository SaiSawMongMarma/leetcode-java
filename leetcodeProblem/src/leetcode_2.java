public class leetcode_2{

    // Definition of Linked List node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            // Dummy node makes it easier to build the result list
            ListNode dummy = new ListNode(0);

            // Current pointer for creating new nodes
            ListNode current = dummy;

            // Carry from the previous addition
            int carry = 0;

            // Continue while either list has nodes or carry exists
            while (l1 != null || l2 != null || carry != 0) {

                int sum = carry;

                // Add value from l1
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                // Add value from l2
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                // Calculate carry
                carry = sum / 10;

                // Last digit becomes the new node
                current.next = new ListNode(sum % 10);

                // Move current pointer
                current = current.next;
            }

            // Dummy node itself is not part of the answer
            return dummy.next;
        }
    }

    // Function to print linked list
    static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // l1 = [2,4,3]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // l2 = [5,6,4]
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print result
        printList(result);
    }
}




//Leetcode Version
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        ListNode dummy = new ListNode(0);
//        ListNode current = dummy;
//
//        int carry = 0;
//
//        while (l1 != null || l2 != null || carry != 0) {
//
//            int sum = carry;
//
//            if (l1 != null) {
//                sum += l1.val;
//                l1 = l1.next;
//            }
//
//            if (l2 != null) {
//                sum += l2.val;
//                l2 = l2.next;
//            }
//
//            carry = sum / 10;
//
//            current.next = new ListNode(sum % 10);
//            current = current.next;
//        }
//
//        return dummy.next;
//    }
//}


//core 3 line
//carry = sum / 10;
//current.next = new ListNode(sum % 10);
//current = current.next;
//Reversing a linked List without using extra space

//import java.util.LinkedList;

//Iterative Method
public class linkedList_5 {
    linkedList_5.Node head;
    private int size;


    linkedList_5 () {
        size = 0;
    }

    // 1.Creating Node
    public class Node {
        int data;
        linkedList_5.Node next;


        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first
    public void addFirst(int data) {
        linkedList_5.Node newNode = new linkedList_5.Node(data);
        newNode.next = head;
        head = newNode;
    }
    // add - last
    public void addLast(int data) {
        linkedList_5.Node newNode = new linkedList_5.Node(data);


        if(head == null) {
            head = newNode;
            return;
        }

//for traverse or travel
        linkedList_5.Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }


        lastNode.next = newNode;
    }


    public void printList() {
        linkedList_5.Node currNode = head;


        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }


        System.out.println("null");

    }


    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }


        head = this.head.next;
        size--;
    }


    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }


        size--;
        if(head.next == null) {
            head = null;
            return;
        }


        linkedList_5.Node currNode = head;
        linkedList_5.Node lastNode = head.next;

        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }


        currNode.next = null;
    }


    public int getSize() {
        return size;
    }

//    Reverse List Part
    public void reverseList() {
        if(head == null || head.next == null) {
            return;
        }


        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

//    Reverse list in  recursive way
    public Node reverseListRecursive(Node head) {
        //empty node || last node or only one node
        if(head == null || head.next == null) {
            return head;
        }


        Node newHead = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }



    //2.List initialize
    public static void main(String args[]) {
        linkedList_5 list = new linkedList_5();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.reverseList();
        list.printList();

    }
}

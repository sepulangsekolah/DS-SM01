// Java program to check if
// linked list is circular
import java.util.*;

class CiCLL {

    /* Link list Node */
    static class Node {
        int data;
        Node next;
    }

    /*
     * This function returns true if given linked list is circular, else false.
     */
    static boolean isCircular(Node head) {
        // An empty linked list is circular
        if (head == null)
            return true;

        // Next of head
        Node node = head.next;
        // This loop would stop in both cases (1) If
        // Circular (2) Not circular
        while (node != null && node != head)
            node = node.next;

        // If loop stopped because of circular
        // condition
        return (node == head);
    }

    // Utility function to create a new node.
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    // function to insert a node at the
    // beginning of the linked list
    static Node push(Node head_ref, int new_data) {
        // allocate node
        Node new_node = new Node();

        // put in the data
        new_node.data = new_data;

        // link the old list to the new node
        new_node.next = (head_ref);

        // move the head to point to the new node
        (head_ref) = new_node;
        return head_ref;
    }

    /*
     * Function to insert a node at the beginning of a Circular linked list
     */
    static Node push2(Node head_ref, int data) {
        Node ptr1 = new Node();
        Node temp = head_ref;
        ptr1.data = data;
        ptr1.next = head_ref;
        /*
         * If linked list is not null then set the next of last node
         */
        if (head_ref != null) {
            while (temp.next != head_ref)
                temp = temp.next;
            temp.next = ptr1;
        } else
            ptr1.next = ptr1;

        head_ref = ptr1;
        return head_ref;
    }

    /* Driver code */
    public static void main(String args[]) {
        /* Start with the empty list */
        Node head = null;
        head = push(head, 1);
        head = push(head, 2);
        head = push(head, 3);
        head = push(head, 4);

        System.out.print(isCircular(head) ? "Yes\n" : "No\n");

        Node head2 = null;
        head = push2(head2, 1);
        head = push2(head2, 2);
        head = push2(head2, 3);
        head = push2(head2, 4);

        System.out.print(isCircular(head2) ? "Yes\n" : "No\n");

    }
}
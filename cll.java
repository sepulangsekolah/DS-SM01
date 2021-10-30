class cll {

    // Node
    static class Node {
        int data;
        Node next;
    };

    // Function to insert a node at the beginning of a Circular linked list
    static Node push(Node head_ref, int data) {
        Node ptr1 = new Node();
        Node temp = head_ref;
        ptr1.data = data;
        ptr1.next = head_ref;

        // If linked list is not null then set the next of last node
        if (head_ref != null) {
            while (temp.next != head_ref)
                temp = temp.next;
            temp.next = ptr1;
        } else
                ptr1.next = ptr1;

        head_ref = ptr1;

        return head_ref;
    }

    // Function to print nodes in a given Circular linked list

    static void printList(Node head) {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // Initialize lists as empty
        Node head = null;

        head = push(head, 13);
        head = push(head, 33);
        head = push(head, 22);
        head = push(head, 13);

        System.out.println("Contents of Circular " + "Linked List:");
        printList(head);
    }
}
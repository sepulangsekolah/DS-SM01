// Java Program to Reverse a List using Data Swapping
class DLLR {
    static class Node {
        int data;
        Node prev, next;
    };

    static Node newNode(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.prev = temp.next = null;
        return temp;
    }

    static void printList(Node head) {
        while (head.next != null) {
            System.out.print(head.data + " <-> ");
            head = head.next;
        }
        System.out.println(head.data);
    }

    // Insert a new node at the head of the list
    static Node insert(Node head, int val) {
        Node temp = newNode(val);
        temp.next = head;
        (head).prev = temp;
        (head) = temp;
        return head;
    }

    // Function to reverse the list
    static Node reverseList(Node head) {
        Node left = head, right = head;

        // Traverse the list and set right pointer to end of list
        while (right.next != null)
            right = right.next;

        // Swap data of left and right pointer and move them
        // towards each other until they meet or cross each other
        while (left != right && left.prev != right) {
            // Swap data of left and right pointer
            int t = left.data;
            left.data = right.data;
            right.data = t;
            // Advance left pointer
            left = left.next;
            // Advance right pointer
            right = right.prev;
        }
        return head;
    }

    // Driver code
    public static void main(String args[]) {
        Node head = newNode(5);
        head = insert(head, 4);
        head = insert(head, 3);
        head = insert(head, 2);
        head = insert(head, 1);

        printList(head);
        System.out.println("List After Reversing");
        head = reverseList(head);
        printList(head);

    }
}
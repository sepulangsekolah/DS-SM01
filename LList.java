// A simple Java program to introduce a linked list.
class LList {
 Node head; // head of list

 /* Linked list Node. This inner class is made static so that
 main() can access it */
 static class Node {
 int data;
 Node next;
 Node(int d) {
 data = d;
 next = null;
 } // Constructor
 }
 static void printList(Node head) {
 while (head != null) {
 System.out.print(head.data + "->");
 head = head.next;
 }
 System.out.println("null");
 }

 /* method to create a simple linked list with 3 nodes*/
 public static void main(String[] args) {
 /* Start with the empty list. */
 LList llist = new LList();

 llist.head = new Node(1);
 Node second = new Node(2);
 Node third = new Node(3);
 System.out.println("before:");
 printList(llist.head);
 printList(second);
 printList(third);
 /* Three nodes have been allocated dynamically.
 We have references to these three blocks as head,
 second and third

 llist.head second third
 | | |
 | | |
 +----+------+ +----+-----+ +---+-----+
 | 1 | null | | 2 | null | | 3 | null |
 +----+------+ +----+-----+ +---+-----+ */

 // Link first node with the second node
 llist.head.next = second;

 /* Now next of the first Node refers to the second.
 So they both are linked.

 llist.head second third
 | | |
 | | |
 +----+------+ +----+------+ +----+------+
 | 1 | o-------->| 2 | null | | 3 | null |
 +----+------+ +----+------+ +----+------+ */

 // Link second node with the third node.
 second.next = third;

 /* Now next of the second Node refers to third.
 So all three nodes are linked.

 llist.head second third
 | | |
 | | |
 +----+------+ +-----+------+ +-----+-------+
 | 1 | o-------->| 2 | o-------->| 3 | null |
 +----+------+ +-----+------+ +-----+-------+ */
 System.out.println("After linked:");
 printList(llist.head);
 }
} 
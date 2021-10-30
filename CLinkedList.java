public class CLinkedList {
    Node last;

    static class Node {
        int data;
        Node next;
    };

    // Function to add a node to the empty list
    public Node addToEmpty(int data) {
        // If not empty
        if (this.last != null)
            return this.last;
        // Creating a node dynamically
        Node temp = new Node();
        // Assigning the data
        temp.data = data;
        this.last = temp;
        // Creating the link
        this.last.next = this.last;
        return last;
    }

    // Function to add a node to the
    // beginning of the list
    public Node addBegin(int data) {
        // If list is empty
        if (last == null)
            return addToEmpty(data);
        // Create node
        Node temp = new Node();
        // Assign data
        temp.data = data;
        temp.next = this.last.next;
        this.last.next = temp;
        return this.last;
    }

    // Function to traverse and print the list
    public void traverse() {
        Node p;
        // If list is empty
        if (this.last == null) {
            System.out.println("List is empty.");
            return;
        }
        // Pointing to the first Node of the list
        p = this.last.next;
        // Traversing the list
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != this.last.next);
        System.out.println("");
    }

    // Function to find the length of the CircularLinkedList
    public int length() {
        // Stores the length
        int x = 0;
        // List is empty
        if (this.last == null)
            return x;
        // Iterator Node to traverse the List
        Node itr = this.last.next;
        while (itr.next != this.last.next) {
            x++;
            itr = itr.next;
        }
        // Return the length of the list
        return (x + 1);
    }

    // Function to split the first k nodes into
    // a new CircularLinkedList and the remaining
    // nodes stay in the original CircularLinkedList
    public Node split(int k) {
        // Empty Node for reference
        Node pass = new Node();
        // Check if the list is empty
        // If yes, then return null
        if (this.last == null)
            return this.last;

        // NewLast will contain the last node of
        // the new split list
        // itr to iterate the node till
        // the required node
        Node newLast, itr = this.last;
        for (int i = 0; i < k; i++) {
            itr = itr.next;
        }
        // Update NewLast to the required node and
        // link the last to the start of rest of the list
        newLast = itr;
        pass.next = itr.next;
        newLast.next = this.last.next;
        this.last.next = pass.next;
        // Return the last node of the required list
        return newLast;
    }

    // Driver code
    public static void main(String[] args) {
        CLinkedList clist = new CLinkedList();
        clist.last = null;
        clist.addToEmpty(12);
        clist.addBegin(10);
        clist.addBegin(8);
        clist.addBegin(6);
        clist.addBegin(4);
        clist.addBegin(2);
        System.out.println("Original list:");
        clist.traverse();
        int k = 4;
        // Create a new list for the starting k nodes
        CLinkedList clist2 = new CLinkedList();
        // Append the new last node into the new list
        clist2.last = clist.split(k);
        // Print the new lists
        System.out.println("The new lists are:");
        clist2.traverse();
        clist.traverse();
    }
}
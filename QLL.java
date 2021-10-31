/* Java program to demonstrate the
   creation of queue object using the
   LinkedList class */
import java.util.*;

class QLL {
    public static void main(String args[]) {
        // Creating empty LinkedList
        Queue<Integer> ll = new LinkedList<Integer>();
        // Adding items to the ll (0 upto 4)
        // using add()
        for (int i = 0; i < 5; i++)
            ll.add(i);
        // Display contents of the queue.
        System.out.println("Elements of queue: " + ll);
        // Printing the top element of
        // the LinkedList
        System.out.println("the top :" + ll.peek());
        // Display contents of the queue.
        System.out.println("Elements of queue after peek: " + ll);
        // Printing the top element and removing it
        // from the LinkedList container
        System.out.println("Print the top and remove :" + ll.poll());
        // Display contents of the queue.
        System.out.println("Elements of queue after poll: " + ll);
    }
}
/* Java Program Demonstrate element() and clear()
   method of Queue */
import java.util.*;

public class QElmLLClr {
    public static void main(String[] args) throws IllegalStateException {
        // create object of Queue
        Queue<Integer> Q = new LinkedList<Integer>();
        // Add numbers to end of Queue
        Q.add(622);
        Q.add(32);
        Q.add(663);
        Q.add(53);
        // Print queue
        System.out.println("Queue: " + Q);
        // print head
        System.out.println("Queue's head: " + Q.element());
        Q.clear();
        // print queue
        System.out.println("Queue: " + Q);
        System.out.println("Queue's head: " + Q.peek());
        try {
            // Queue is empty now hence exception
            System.out.println("Queue's head: " + Q.element());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
import java.util.*;

public class QElmLL {
    public static void main(String[] args) throws IllegalStateException {
        // create object of Queue
        Queue<Integer> Q = new LinkedList<Integer>();
        System.out.println("Queue's head: " + Q.peek());
        try {
            System.out.println("Queue's head: " + Q.element());
        } catch (Exception e) {
            System.out.println(e);
        }
        // Add numbers to end of Queue
        Q.add(622);
        Q.add(32);
        Q.add(663);
        Q.add(53);
        // print queue
        System.out.println("Queue: " + Q);
        // print head
        System.out.println("Queue's head: " + Q.element());
    }
}
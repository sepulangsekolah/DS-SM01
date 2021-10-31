/* Java program to demonstrate the
   iteration of elements in deque */
import java.util.*;

public class IterateArrDeque {
    public static void main(String[] args) {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();
        // add() method to insert at the back
        dq.add("For");
        // add element at the front
        dq.addFirst("Structure");
        // add element at the back
        dq.addLast("Data");
        dq.add("is so attempting");
        /*
         * Iterate using Iterator interface from the front of the queue
         */
        for (Iterator itr = dq.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        // Iterate in reverse sequence in a queue
        for (Iterator itr = dq.descendingIterator(); itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }
}
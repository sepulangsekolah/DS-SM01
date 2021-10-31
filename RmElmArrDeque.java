// Java program to demonstrate the
// removal of elements in deque
import java.util.*;

public class RmElmArrDeque {
    public static void main(String[] args) {
        // Initializing a deque
        Deque<String> dq = new ArrayDeque<String>();
        // add() method to insert
        dq.add("Two");
        // addFirst inserts at the front
        dq.addFirst("One");
        // addLast inserts at the back
        dq.addLast("Three");
        // print elements to the console
        System.out.println("ArrayDeque : " + dq);
        // remove element as a stack from top/front
        System.out.println(dq.pop());
        // remove element as a queue from front
        System.out.println(dq.poll());
        // remove element from front
        System.out.println(dq.pollFirst());
        // remove element from back
        System.out.println(dq.pollLast());
    }
}
/* Java program to demonstrate the addition of elements
   in ArrayDeque implementation of Deque */
import java.util.*;

public class AddElmArrDeque {
    public static void main(String[] args) {
        // Initializing a deque since deque is an interface
        // it is assigned the ArrayDeque class
        Deque<String> dq = new ArrayDeque<String>();
        // add() method to insert
        dq.add("The");
        dq.addFirst("To");
        dq.addLast("Structure");
        // offer() method to insert
        dq.offer("For");
        dq.offerFirst("Welcome");
        dq.offerLast("Data");
        // printing Elements of ArrayDeque to the console
        System.out.println("ArrayDeque : " + dq);
    }
}
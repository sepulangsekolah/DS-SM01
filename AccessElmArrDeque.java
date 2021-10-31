/* Java program to access the
   elements of ArrayDeque */
import java.util.*;

public class AccessElmArrDeque {
    public static void main(String args[]) {
        // Creating an empty ArrayDeque
        ArrayDeque<String> de_que = new ArrayDeque<String>();
        // Use add() method to add elements into the Deque
        de_que.add("Welcome");
        de_que.add("To");
        de_que.add("Structure");
        de_que.add("of");
        de_que.add("Data");
        // Displaying the ArrayDeque
        System.out.println("ArrayDeque: " + de_que);
        // Displaying the First element
        System.out.println("The first element is: " + de_que.getFirst());
        // Displaying the Last element
        System.out.println("The last element is: " + de_que.getLast());
    }
}
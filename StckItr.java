// Java code to illustrate iterator()
import java.util.*;
import java.util.Stack;

// Stack Iterator
public class StckItr {
    public static void main(String args[]) {
        // Creating an empty Stack
        Stack<String> stack = new Stack<String>();
        // Use add() method to add elements into the Stack
        stack.add("Welcome");
        stack.add("To");
        stack.add("Data");
        stack.add("Structure");
        stack.add("IF-A");
        // Displaying the Stack
        System.out.println("Stack: \n" + stack);
        // Creating an iterator
        Iterator value = stack.iterator();
        // Displaying the values
        // after iterating through the stack
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.print(value.next() + " ");
        }
        System.out.println();
    }
}
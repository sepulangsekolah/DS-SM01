// Java code to illustrate firstElement and lastElement
import java.util.*;

// Stack first & last elm
public class SFLElm {
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
        // Displaying the first element
        System.out.println("The first element is: " + stack.firstElement());
        // Displaying the last element
        System.out.println("The last element is: " + stack.lastElement());
    }
}
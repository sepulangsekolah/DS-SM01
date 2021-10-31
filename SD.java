// Java code to illustrate push, peek and pop methods
import java.util.*;

// Stack Demo
public class SD {// push, peek, pop
    public static void main(String args[]) {
        // Creating an empty Stack
        Stack<String> STACK = new Stack<String>();
        String t1, t2 = "";
        // Use push() to add elements into the Stack
        STACK.push("Data");
        STACK.push("Structure");
        STACK.push("IF");
        STACK.push("A");
        STACK.push("13.00");
        // Displaying the Stack
        System.out.println("Initial Stack: " + STACK);
        // Pop elements out of the stack
        t1 = STACK.peek();
        System.out.println("peek-1: " + t1);
        t2 = STACK.peek();
        System.out.println("peek-2: " + t2);
        // Displaying the Stack
        System.out.println("Stack after peek: " + STACK);
        // Pushing elements into the stack
        STACK.push("Monday");
        // Displaying the Stack
        System.out.println("Stack after push-1: " + STACK);
        STACK.push("Session");
        // Displaying the Stack
        System.out.println("Stack after push-2: " + STACK);
        // Pop elements out of the stack
        t1 = STACK.pop();
        System.out.println("pop-1: " + t1);
        t2 = STACK.pop();
        System.out.println("pop-2: " + t2);
        // Displaying the Stack
        System.out.println("Stack after pop: " + STACK);
    }
}
import java.util.*;

public class StckIdxOf {
    public static void main(String args[]) {
        // Creating an empty Stack
        Stack<String> stack = new Stack<String>();

        // Use add() method to add elements in the Stack
        stack.add("Welcome");
        stack.add("To");
        stack.add("Data");
        String t1 = stack.elementAt(2);
        stack.add("Structure");
        stack.add("IF-A");
        String t2 = stack.elementAt(4);

        // Displaying the Stack
        System.out.println("Stack: \n" + stack);

        // The first position of an element is returned
        System.out.println("The first occurrence of " + t1 + "\nis at index:" + stack.indexOf("Data"));
        System.out.println("The first occurrence of " + t2 + "\nis at index: " + stack.indexOf("IF-A"));
    }
}
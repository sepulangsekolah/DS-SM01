// Java code to illustrate insertElementAt & removeElementAt
import java.util.*;

//Stack Demo 2
public class SD2 {
 public static void main(String args[])
 {
 // Creating an empty Stack
 Stack<String> stack = new Stack<String>();

 // Use add() method to add elements into the Stack
 stack.add("Welcome");
 stack.add("To");
 stack.add("Data");
 stack.add("Structure"); 
 stack.add("IF-A");

 // Displaying the Stack
 System.out.println("Stack before : \n" + stack);

 // Inseting element at 3rd position
 stack.insertElementAt("Hello", 2);

 // Inseting element at last position
 stack.insertElementAt("World", 6);
 // Displaying the Stack
 System.out.println("Stack after insert: \n" + stack);
 // Deleting element at 2nd position
 stack.removeElementAt(2);

 // Deleting element at last position
 stack.removeElementAt(5);//after first remove 6-1=5
 // Displaying the Stack
 System.out.println("Stack after remove: \n" + stack);
 }
}
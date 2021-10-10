// Java code to demonstrate the working
// of getLast() in linked list
import java.util.LinkedList;

public class LLGetLast {
    public static void main(String[] args) {
        // declaring a LinkedList
        LinkedList<String> list = new LinkedList<String>();

        // adding elements using add()
        list.add("Linked");
        list.add("5");
        list.add("List");
        list.add("7");

        // printing the whole list
        System.out.println("The elements in List are : " + list);
        // using get() to print element at last index
        System.out.println("Element at last index is : " + list.getLast());
    }
}
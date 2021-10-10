// Java code to demonstrate the working
// of getFirst() in linked list
import java.util.LinkedList;

public class LLGetFirst {
    public static void main(String[] args) {
        // declaring a LinkedList
        LinkedList<String> list = new LinkedList<String>();

        // adding elements using add()
        list.add("Linked");
        list.add("2");
        list.add("List");
        list.add("6");

        // printing the whole list
        System.out.println("The elements in List are : " + list);

        // using get() to print element at first index
        System.out.println("Element at first index is : " + list.getFirst());
    }
}
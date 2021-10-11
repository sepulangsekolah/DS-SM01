// Java code to demonstrate the working
// of get(int index) in linked list
import java.util.LinkedList;

public class LLGet {
    public static void main(String[] args) {
        // declaring a LinkedList
        LinkedList<String> list = new LinkedList<String>();
        // adding elements using add()
        list.add("Linked");
        list.add("2");
        list.add("List");
        list.add("5");
        // printing the whole list
        System.out.println("The elements in List are : " + list);
        // using get() to print element at index 3
        System.out.println("Element at index 3 is : " + list.get(3));
    }
}

import java.util.*;

public class VLastElm {
    public static void main(String args[]) {
        Vector<Integer> vector = new Vector<Integer>();
        // Use add() method to add elements into the Vector
        vector.add(10);
        vector.add(15);
        vector.add(20);
        vector.add(25);
        vector.add(30);
        System.out.println("Vector: " + vector);
        System.out.println("The last element is: " + vector.lastElement());
    }
}
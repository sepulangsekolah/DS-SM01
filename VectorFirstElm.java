import java.util.*;

public class VectorFirstElm {
    public static void main(String args[]) {
        Vector<Integer> vector = new Vector<Integer>();
        // Use add() method to add elements into the Vector
        vector.add(5);
        vector.add(15);
        vector.add(30);
        vector.add(20);
        vector.add(2);
        System.out.println("Vector: " + vector);
        System.out.println("The first element is: " + vector.firstElement());
    }
}
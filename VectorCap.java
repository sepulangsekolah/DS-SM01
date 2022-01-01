import java.util.*;

public class VectorCap {
    public static void main(String args[]) {
        Vector<String> vector = new Vector<String>();
        // Use add() method to add elements into the Vector
        vector.add("Welcome");
        vector.add("To");
        vector.add("Structure");
        vector.add("4");
        vector.add("Data");
        vector.add("IF-A");
        System.out.println("Vector: " + vector);
        System.out.println("The capacity is: " + vector.capacity());
    }
}
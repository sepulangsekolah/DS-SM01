import java.util.*;

public class VectorClone {
    public static void main(String args[]) {
        Vector<Integer> vector = new Vector<Integer>();
        // Use add() method to add elements into the Queue
        vector.add(10);
        vector.add(15);
        vector.add(30);
        vector.add(20);
        vector.add(5);
        System.out.println("Vector: " + vector);
        Object copy_vector = (Vector) vector.clone(); // Creating another vector to copy
        System.out.println("The cloned vector is: " + copy_vector);
        System.out.println("equals?: " + vector.equals(copy_vector));
    }
}
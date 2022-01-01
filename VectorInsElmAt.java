import java.util.*;

public class VectorInsElmAt {
    public static void main(String args[]) {
        // Creating an empty Vector
        Vector<Integer> vector = new Vector<Integer>();
        // Use add() method to add elements into the Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        vector.add(70);
        vector.add(80);
        vector.add(90);
        System.out.println("Vector:\n" + vector);
        // Inseting element at 1st position
        vector.insertElementAt(100, 0);
        System.out.println("insertElementAt(100, 0)");
        // Inseting element at 5th position
        vector.insertElementAt(200, 4);
        System.out.println("insertElementAt(200, 4)");
        // Displaying the final Vector
        System.out.println("The final vector is \n" + vector);
    }
}
import java.util.*;

class VectorAddElm {
    public static void main(String[] arg) {
        Vector v1 = new Vector();
        // Add elements using add() method
        v1.add(1);
        v1.add(2);
        v1.add("Data");
        v1.add("Structure");
        v1.add(3);
        // Print the vector
        System.out.println("Vector v1 is " + v1);
        // Create generic vector
        Vector<Integer> v2 = new Vector<Integer>();
        v2.add(1);
        v2.add(2);
        v2.add(3);
        System.out.println("Vector v2 is " + v2);
    }
}
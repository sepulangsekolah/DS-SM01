import java.util.Vector;

public class VectorElmAt {
    public static void main(String args[]) {
        Vector<Integer> vector = new Vector<Integer>();
        // Use add() method to add elements in the Vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("Vector: " + vector);
        System.out.println("The element at 1 is: " + vector.elementAt(1));
    }
}
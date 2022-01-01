import java.util.Vector;

public class VectorGet {
    public static void main(String args[]) {
        Vector<String> vector = new Vector<String>();
        // Use add() method to add elements in the Vector
        vector.add("0");
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("7");
        System.out.println("Vector: " + vector);
        System.out.println("The element is: " + vector.get(5));
    }
}
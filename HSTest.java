import java.util.HashSet;

class HSTest {
    public static void main(String args[]) {
        // Creating a HashSet
        HashSet hs = new HashSet();
        // Adding elements to hashset
        // using add() method
        boolean b1 = hs.add("Hash");
        boolean b2 = hs.add("Set");
        // adding duplicate element
        boolean b3 = hs.add("Set");
        // Printing b1, b2, b3
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        // Printing all elements of hashset
        System.out.println(hs);
    }
}
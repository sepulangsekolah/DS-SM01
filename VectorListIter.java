import java.util.Vector;
import java.util.ListIterator;

public class VectorListIter {
    public static void main(String[] args) {
        Vector<String> vt = new Vector<String>();
        vt.add("Structure");
        vt.add("for");
        vt.add("Data");
        vt.add("2021");
        vt.add("Programming skill");
        // Declare list iterator
        ListIterator listItr = vt.listIterator();
        // Forward iterations
        System.out.println("Forward Traversal:");
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        // Backward iterations
        System.out.println("\nBackward Traversal:");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
    }
}

import java.util.*;

public class LvsAL3 {
    public static void main(String[] args) {
        /* Create an ArrayList String type
        and Initialize an ArrayList with asList() */
        List<String> aL1 = new ArrayList<String>();
        aL1.add("Data");
        aL1.add("Structure");
        aL1.add("IF-A");
        Iterator itr = aL1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        ArrayList<String> aL2 = new ArrayList<String>();
        aL2.add("Data");
        aL2.add("Structure");
        aL2.add("IF-A");
        itr = aL2.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }
}
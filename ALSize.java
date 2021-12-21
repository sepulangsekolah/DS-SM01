import java.util.*;

public class ALSize {
    public static void main(String[] argv)
            throws Exception {
        try {
            // Creating object of ArrayList<Integer>
            ArrayList<Integer> arrlist = new ArrayList<Integer>();
            // Populating arrlist1
            arrlist.add(1);
            arrlist.add(2);
            arrlist.add(3);
            arrlist.add(4);
            arrlist.add(5);
            arrlist.add(6);
            arrlist.add(7);
            arrlist.add(8);
            arrlist.add(9);
            arrlist.add(10);
            // Print arrlist
            System.out.println("Before operation: "
                    + arrlist);
            // Getting total size of arrlist using size() method
            int size = arrlist.size();
            // Print the size of arrlist
            System.out.println("Size of list = "
                    + size);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: "
                    + e);
        }
    }
}
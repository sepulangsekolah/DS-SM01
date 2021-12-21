import java.io.*;
import java.util.ArrayList;

public class ArrayListAddIdx {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>(3);
        // Create an empty array list with an initial capacity
        arrlist.add(10);
        arrlist.add(22);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(140);
        arrlist.add(2);
        arrlist.add(50);
        arrlist.add(80);

        // Adding element 35 at fourth position and 125 at fifth position
        arrlist.add(3, 35);
        arrlist.add(4, 125);

        // Let us print all the elements available in list
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
    }
}
import java.io.*;
import java.util.ArrayList;

public class ArrayListAddAll {
    public static void main(String args[]) {
        // Create an empty array list1 with initial capacity as 5
        ArrayList<Integer> arrlist1 = new ArrayList<Integer>(5);
        // Use add() method to add elements in the list
        arrlist1.add(12);
        arrlist1.add(20);
        arrlist1.add(45);
        // Prints all the elements available in list1
        System.out.println("Printing list 1:");
        for (Integer number : arrlist1)
            System.out.println("Number = " + number);
        // Create an empty array list 2 with an initial capacity
        ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);
        // Use add() method to add elements in list 2
        arrlist2.add(25);
        arrlist2.add(30);
        arrlist2.add(31);
        arrlist2.add(35);
        arrlist2.add(225);
        arrlist2.add(50);
        arrlist2.add(63);
        arrlist2.add(78);
        // Let us print all the elements available in list 2
        System.out.println("\nPrinting list 2:");
        for (Integer number : arrlist2)
            System.out.println("Number = " + number);
        // inserting all elements, list2 will get printed after list 1
        arrlist1.addAll(arrlist2);
        System.out.println("\nPrinting all the elements");
        // Let us print all the elements available in list 1
        for (Integer number : arrlist1)
            System.out.println("Number = " + number);
    }
}
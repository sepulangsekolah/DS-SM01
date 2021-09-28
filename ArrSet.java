// Java code to demonstrate set() method of Array class
import java.lang.reflect.Array;
public class ArrSet {
    // Main method
    public static void main(String[] args) {
        // Declaring and defining an String array
        String s[] = { "Java ","is ","Java" };
        System.out.print("Before set: ");
        // Printing the array
        for (String x : s) {
            System.out.print(x);
        }
        // Set method of class Array
        Array.set(s, 1, "for ");
        System.out.print("\nAfter set: ");
        // Printing array
        for (String x : s) {
            System.out.print(x);
        } System.out.println();
    }
}

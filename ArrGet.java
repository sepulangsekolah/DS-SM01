import java.lang.reflect.Array;
public class ArrGet {
    // Main method
    public static void main(String[] args) {
        // Declaring and defining an int array
        int a[] = { 1, 2, 3, 4, 5 };
        // Traversing the array
        for (int i = 0; i < 5; i++) {
            // Array.get method
            /* Note: Typecasting is essential
               as the return type in Object. */
            int x = (int)Array.get(a, i);
            // Printing the values
            System.out.print(x + " ");
        } System.out.println();
    }
}

// Java program to demonstrate working of Arrays.equals()
import java.util.Arrays;
public class ArrayEqual {
    public static void main (String[] args){
        // Let us create diff integers arrays
        int[] array = new int [] {1, 2, 3, 4};
        int[] array2 = new int [] {1, 2, 3, 4};
        int[] array3 = new int [] {1, 3, 4, 2};
        System.out.println("Is array equals to array2 : " +
            Arrays.equals(array, array2));
        System.out.println("Is array equals to array3 : " +
            Arrays.equals(array, array3));
    }
}
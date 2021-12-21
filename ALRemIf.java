import java.util.*;

public class ALRemIf {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        // Add Number to list
        Numbers.add(103);
        Numbers.add(122);
        Numbers.add(145);
        Numbers.add(132);
        // Apply removeIf() method
        // Remove numbers divisible by 3
        Numbers.removeIf(n -> (n % 3 == 0));
        // Print list
        for (int i : Numbers) {
            System.out.println(i);
        }
    }
}
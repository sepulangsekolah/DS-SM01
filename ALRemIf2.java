import java.util.*;

public class ALRemIf2 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Mel");
        students.add("Reza");
        students.add("Revan");
        students.add("Randi");
        students.add("Ali");
        // Apply removeIf() method
        // Remove names start with R
        students.removeIf(n -> (n.charAt(0) == 'R'));
        System.out.println("Students name Does not start with R");
        // print list
        for (String str : students) {
            System.out.println(str);
        }
    }
}
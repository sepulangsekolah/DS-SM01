/* Java Program Demonstrate removeIf()
   method of ArrayDeque */
import java.util.*;

public class ADRemoveIf {
    public static void main(String[] args) {
        /* create an ArrayDeque
           containing a list of string values */
        ArrayDeque<String> students = new ArrayDeque<String>();
        // Add Strings to list each string represents student name
        students.add("Ali");
        students.add("Alif");
        students.add("Cece");
        students.add("Fitri");
        students.add("Reviola");
        students.add("Dedi");
        /* apply removeIf() method
           to remove names which start with ‘A’ */
        students.removeIf(n -> (n.charAt(0) == 'C'));
        System.out.println("Students name do not starts with C");
        // print list
        for (String str : students) {
            System.out.println(str);
        }
    }
}
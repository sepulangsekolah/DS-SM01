import java.util.*;

public class AL4Each2 {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Mel");
        students.add("Ali");
        students.add("Alip");
        students.add("Revan");
        System.out.println("List of Students:");
        students.forEach((n) -> print(n));
    }

    public static void print(String n) {
        System.out.println("Student Name is " + n);
    }
}

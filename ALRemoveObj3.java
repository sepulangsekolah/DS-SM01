import java.util.List;
import java.util.ArrayList;

public class ALRemoveObj3 { // idx
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(30);
        al.add(40);
        al.add(55);
        al.add(70);
        System.out.println("Original ArrayList : " + al);

        // This makes a call to remove(int) and
        // removes element 20.
        al.remove(1);
        System.out.println("Modified(1) ArrayList : " + al);

        // Now element 30 is moved one position back
        // So element 30 is removed this time
        al.remove(1);

        System.out.println("Modified(2) ArrayList : " + al);
    }
}

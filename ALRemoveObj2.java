import java.util.List;
import java.util.ArrayList;

public class ALRemoveObj2 {// first
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(30);
        al.add(40);
        al.add(55);
        al.add(70);
        System.out.println("Original ArrayList : " + al);
        al.remove(new Integer(10));
        System.out.println("Modified ArrayList : " + al);
    }
}

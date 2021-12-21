import java.util.List;
import java.util.ArrayList;

public class ALRemove2 { // first
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(30);
        al.add(40);
        al.add(55);
        al.add(70);
        System.out.println("Original ArrayList : " + al);
        int index = 0;
        al.remove(index);
        System.out.println("Modified ArrayList : " + al);
    }
}
import java.util.List;
import java.util.ArrayList;

public class ALRemove {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(35);
        al.add(40);
        System.out.println("Original ArrayList : " + al);
        // Calculate index of last element
        int index = al.size() - 1;
        // Delete last element by passing index
        al.remove(index);
        System.out.println("Modified ArrayList : " + al);
    }
}
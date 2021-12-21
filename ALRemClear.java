import java.util.ArrayList;

public class ALRemClear {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Data");
        list.add("Structure");
        list.add("4");
        list.add("IF-A");
        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList = "
                + list.size());
        list.clear();
        System.out.println("After clear\n"
                + "ArrayList: " + list);
        System.out.println("Size of ArrayList = "
                + list.size());
    }
}
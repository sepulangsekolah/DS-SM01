import java.util.*;

class HSCollObjStrg {
    public static void main(String[] args) {
        // Instantiate an object of HashSet
        HashSet<ArrayList> set = new HashSet<>();
        // Create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();
        // Create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();
        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set.add(list1);
        set.add(list2);
        // Print the set size to understand the
        // internal storage of ArrayList in Set
        System.out.println("Set size:" + set.size());
        System.out.println("List 1:" + list1);
        System.out.println("List 2:" + list2);
        System.out.println("Set:" + set);
    }
}
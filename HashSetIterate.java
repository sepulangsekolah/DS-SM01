import java.util.*;

class HashSetIterate {
    public static void main(String[] args) {
        // Instantiate an object of HashSet
        HashSet<String> hs = new HashSet<String>();
        // Elements are added using add() method
        String s0 = "0", s1 = "1", s2 = "2", s3 = "3", s4 = "4", s5 = "5", s6 = "6",
                s8 = "8", s9 = "9";
        hs.add(s0);
        hs.add(s8);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s3);
        hs.add(s4);
        hs.add(s6);
        hs.add(s9);
        hs.add("xxxx");
        // Iterating though the HashSet
        Iterator itr = hs.iterator();
        System.out.println("iterate:");
        while (itr.hasNext())
            System.out.print(itr.next() + ", ");
        System.out.println();
        System.out.println("for:");
        // Using enhanced for loop
        for (String s : hs)
            System.out.print(s + ", ");
        System.out.println();
    }
}
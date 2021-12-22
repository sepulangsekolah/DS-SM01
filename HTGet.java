import java.util.*;

class HTGet {
    public static void main(String[] arg) {
        // Creating a hash table
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        // enter name/marks pair
        ht.put(345,"Cappucino");
        ht.put(245,"Moccacino");
        ht.put(490,"Coffee");
        ht.put(365,"Chocolatte");
        ht.put(435,"Coffeelatte");
        // get the value mapped with key krantz
        System.out.println("get:\"coffee\"");
        System.out.println("value:" + ht.get("coffee"));
    }
}
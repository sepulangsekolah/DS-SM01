// Deprecated
import java.util.*;

class HTGetOld {
    public static void main(String[] arg) {
        // creating a hash table
        Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
        // enter name/marks pair
        marks.put("Cappucino", new Integer(345));
        marks.put("Moccacino", new Integer(245));
        marks.put("Coffee", new Integer(490));
        marks.put("Chocolatte", new Integer(365));
        marks.put("Coffeelatte", new Integer(435));
        // get the value mapped with key krantz
        System.out.println("get:\"coffee\"");
        System.out.println("value:" + marks.get("coffee"));
    }
}
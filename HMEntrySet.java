import java.util.*;

public class HMEntrySet {
    public static void main(String args[]) {
        // Creation of HashMap
        HashMap<String, String> hm = new HashMap<>();

        // Adding values to HashMap as ("keys", "values")
        hm.put("Language", "Java");
        hm.put("Code", "HashMap");
        hm.put("Learn", "More");

        // .entrySet() returns all the keys with their values present in Hashmap
        Set<Map.Entry<String, String>> mappinghm = hm.entrySet();
        System.out.println("Set of Keys and Values using entrySet() : \n" + mappinghm);
        System.out.println();

        // Using .getOrDefault to access value
        // Here it is Showing Default value as key - "Code" was already present
        System.out.println("Using .getorDefault : \n"
                + hm.getOrDefault("Code", "javaArticle"));

        // Here it is Showing set value as key - "Search" was not present
        System.out.println("Using .getorDefault : \n"
                + hm.getOrDefault("Search", "javaArticle"));
        System.out.println();

        // .replace() method replacing value of key "Learn"
        hm.replace("Learn", "Methods");
        System.out.println("working of .replace() : \n" + mappinghm);
        System.out.println();

        /*  putIfAbsent() method is placing a new key-value
            as they were not present initially */
        hm.putIfAbsent("Cool", "HashMap methods");
        System.out.println("Working of .putIfAbsent() : \n" + mappinghm);

        /*  .putIfAbsent() method is not doing anything
            as key-value were already present */
        hm.putIfAbsent("Code", "With_JAVA");
        System.out.println("working of .putIfAbsent() : \n" + mappinghm);

    }
}

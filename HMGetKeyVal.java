import java.util.HashMap;
import java.util.Map;

public class HMGetKeyVal {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Dani", 70);
        map.put("Angga", 90);
        map.put("Anggi", 80);

        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey() +
                    ", Value: " + e.getValue());
    }
}
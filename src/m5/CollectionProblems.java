package m5;

import java.util.HashMap;
import java.util.Map;

public class CollectionProblems {
    public static void main(String[] args) {
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("Maaike", "Java");
        stringStringMap.put("Remsey", "C#");

        for(String k : stringStringMap.keySet()) {
            System.out.println(k + " loves coding " + stringStringMap.get(k));
            stringStringMap.remove(k);
        }
    }
}

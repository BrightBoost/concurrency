package m5;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipList {
    public static void main(String[] args) {
        Set<String> set = new ConcurrentSkipListSet<>();
        set.add("Tim");
        set.add("Pascal");
        set.add("Elias");

        for(String s : set) {
            System.out.println(s);
        }

        Map<String, String> map = new ConcurrentSkipListMap<>();
        map.put("Guitar", "Jesse");
        map.put("Bass", "Job");
        map.put("Piano", "Sietske");

        for(String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }
    }
}

package m5;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingQueue;

public class CollectionInterfaces {
    public static void main(String[] args) {
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        map.put("Nadesh", "PHP");

        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.offer("Maria");

    }
}

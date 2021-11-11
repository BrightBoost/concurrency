package m5;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ConcurrentBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.offer("Maria");
        queue.offer("Saleh");
        queue.offer("Tom");

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.contains("Saleh"));

        System.out.println(queue);

        //special for concurrent queues
        try {
            queue.offer("Jim", 200, TimeUnit.MILLISECONDS);
            queue.poll(300, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(queue);

    }
}

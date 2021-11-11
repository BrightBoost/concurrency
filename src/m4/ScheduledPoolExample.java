package m4;

import java.util.concurrent.*;

public class ScheduledPoolExample {
    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(50);

    public static void main(String[] args) {
        int i = 0;
        executorService.scheduleAtFixedRate(() -> {
            System.out.println(i + " Thread id: " + Thread.currentThread().getId());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 2000, 100, TimeUnit.MILLISECONDS);
        try {
            executorService.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

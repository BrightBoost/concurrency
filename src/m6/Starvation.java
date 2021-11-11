package m6;

import java.util.concurrent.atomic.AtomicInteger;

public class Starvation {
    private static Object lock = new Object();
    private static volatile boolean isActive = true;

    public static void run() {
        Thread lowPriorityThread = new Thread(new WorkerThread(), "Low");
        Thread highPriorityThread = new Thread(new WorkerThread(), "High");

        // this is not always going to work, it is merely a suggestion to use a certain priority.
        // what happens is up to the OS
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);


        lowPriorityThread.start();
        highPriorityThread.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        isActive = false;

    }

    private static class WorkerThread implements Runnable {

        private AtomicInteger count = new AtomicInteger();

        public void run() {

            while (isActive) {
                synchronized (lock) {
                    try {
                        task();
                    } catch (Exception e) {
                        System.out.format("%s got interrupted...\n", Thread.currentThread().getName());
                        e.printStackTrace();
                    }
                }
            }
            System.out.format("DONE===> %s: Nr of times: %d...\n", Thread.currentThread().getName(), count.get());
        }

        private void task() {
            System.out.format("%s: Nr of times: %d...\n", Thread.currentThread().getName(), count.getAndIncrement());
        }
    }

    public static void main(String[] args) {
        run();
    }

}

package m3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCount {
    public static int counter = 0;
    public static Lock lock = new ReentrantLock();

    public static void incrementCounter(){
        try {
            lock.lock();
            int current = counter;
            System.out.println(counter);
            counter = current + 1;
        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> incrementCounter());
            t.start();
        }
    }
}

package m2;

public class RiddleThread extends Thread {
    public void run(){
        System.out.println("I'm the task of m2.CustomThread!");
        System.out.println("The thread id in task is: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        RiddleThread ct = new RiddleThread();
        ct.run();
        System.out.println("The thread id in main is: " + Thread.currentThread().getId());
    }
}

package m2;

public class App {
    public static void main(String[] args) {
        // RunThread is implementing Runnable
        Thread t = new Thread(new RunThread());
        t.start();


        try {
            t.join(1500);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        Thread t2 = new Thread(new RunThread());
        t2.start();

    }
}

package m2;

import java.util.concurrent.Callable;

public class CallThread implements Callable<Object> {
    @Override
    public Object call() {
        System.out.println("In call.");
        return new Object();
    }


}

package m3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        var syncList = Collections.synchronizedList(list);

        //go ahead and use syncList safely with multiple threads
    }
}

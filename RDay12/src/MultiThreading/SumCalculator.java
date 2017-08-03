package MultiThreading;

import java.util.concurrent.*;

/**
 * Created by sahoos on 8/1/2017.
 */
public class SumCalculator {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            executor.execute(new SumTask());
        }
    }
}

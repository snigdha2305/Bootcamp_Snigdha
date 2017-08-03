package MultiThreading;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by sahoos on 8/2/2017.
 */
public class CallableDemo {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        Future<Integer> future[] = new Future[5];

        future[0] = executor.submit(new SumPrimeTask(1, 100));
        future[1] = executor.submit(new SumPrimeTask(101, 200));
        future[2] = executor.submit(new SumPrimeTask(201, 300));
        future[3] = executor.submit(new SumPrimeTask(301, 400));
        future[4] = executor.submit(new SumPrimeTask(401, 500));

        int totalsum = 0;

        try {
            for (int i = 0; i < future.length; i++) {
                if (!future[i].isCancelled()) {
                    int rs = future[i].get();
                    totalsum += future[i].get();
                    System.out.printf("Result : %d%n", rs);
                }
            }
            System.out.printf("Total Sum : %d%n", totalsum);
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted!!!");
        } catch (ExecutionException e) {
            System.out.println("Task can not be executed!!!");
        } catch (CancellationException e) {
            System.out.println("Task already got cancelled!!!");
        }
    }
}

class SumPrimeTask implements Callable<Integer> {

    int start;
    int end;

    public SumPrimeTask(int start, int end) {
        this.start = start;
        this.end = end;
    }


    public Integer call() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            int c = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

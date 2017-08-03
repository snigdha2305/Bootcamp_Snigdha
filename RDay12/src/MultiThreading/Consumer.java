package MultiThreading;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sahoos on 8/1/2017.
 */
public class Consumer implements Runnable {

    LinkedBlockingQueue<Integer> integerQueue = null;

    public Consumer(LinkedBlockingQueue<Integer> integerQueue) {
        this.integerQueue = integerQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int val = this.integerQueue.poll();
                System.out.println(val);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}

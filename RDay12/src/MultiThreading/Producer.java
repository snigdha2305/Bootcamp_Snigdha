package MultiThreading;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sahoos on 8/1/2017.
 */
public class Producer implements Runnable {

    LinkedBlockingQueue<Integer> integerQueue = null;

    public Producer(LinkedBlockingQueue<Integer> integerQueue) {
        this.integerQueue = integerQueue;
    }

    @Override
    public void run() {
        while (true) {
            int val = (int) (Math.random() * 1000);
            this.integerQueue.offer(val);
        }
    }
}

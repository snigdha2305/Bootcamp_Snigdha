<<<<<<< HEAD
package MultiThreading;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sahoos on 8/1/2017.
 */
public class Producer implements Runnable{

        LinkedBlockingQueue<Integer> integerQueue = null;

        public Producer(LinkedBlockingQueue<Integer> integerQueue) {
            this.integerQueue = integerQueue;
        }

        @Override
        public void run() {
            while (true) {
                int val = (int)(Math.random()*1000);
                this.integerQueue.offer(val);
            }
        }
}
=======
package MultiThreading;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sahoos on 8/1/2017.
 */
public class Producer implements Runnable{

        LinkedBlockingQueue<Integer> integerQueue = null;

        public Producer(LinkedBlockingQueue<Integer> integerQueue) {
            this.integerQueue = integerQueue;
        }

        @Override
        public void run() {
            while (true) {
                int val = (int)(Math.random()*1000);
                this.integerQueue.offer(val);
            }
        }
}
>>>>>>> 714f2ed2e981914d5597e2ea11c84a0e23936c54

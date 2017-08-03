<<<<<<< HEAD
package MultiThreading;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sahoos on 8/1/2017.
 */
public class Consumer implements Runnable{

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
=======
package MultiThreading;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sahoos on 8/1/2017.
 */
public class Consumer implements Runnable{

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
>>>>>>> 714f2ed2e981914d5597e2ea11c84a0e23936c54

<<<<<<< HEAD
package MultiThreading;

import java.io.InputStream;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sahoos on 8/1/2017.
 */
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        new ProducerConsumerDemo();
    }

    public ProducerConsumerDemo() {
        LinkedBlockingQueue<Integer> integerQueue = new LinkedBlockingQueue<>();

        Producer producer = new Producer(integerQueue);
        Consumer consumer = new Consumer(integerQueue);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

=======
package MultiThreading;

import java.io.InputStream;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sahoos on 8/1/2017.
 */
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        new ProducerConsumerDemo();
    }

    public ProducerConsumerDemo() {
        LinkedBlockingQueue<Integer> integerQueue = new LinkedBlockingQueue<>();

        Producer producer = new Producer(integerQueue);
        Consumer consumer = new Consumer(integerQueue);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

>>>>>>> 714f2ed2e981914d5597e2ea11c84a0e23936c54

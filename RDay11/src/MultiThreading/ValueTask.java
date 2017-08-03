package MultiThreading;

/**
 * Created by sahoos on 7/31/2017.
 */
public class ValueTask implements Runnable{

        static int i = 0;
        @Override
        public void run() {
            i = i +1;
        }
}

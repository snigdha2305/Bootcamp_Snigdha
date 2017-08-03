package MultiThreading;

/**
 * Created by sahoos on 7/31/2017.
 */
public class PrintTask implements Runnable {

    //ValueTask vt = new ValueTask();

    @Override
    public void run() {
            System.out.println(ValueTask.i);
    }
}

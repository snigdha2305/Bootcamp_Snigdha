<<<<<<< HEAD
package MultiThreading;
import java.util.concurrent.*;

/**
 * Created by sahoos on 8/1/2017.
 */
public class SumCalculator {
    public static void main(String[] args){

        ExecutorService executor =  Executors.newFixedThreadPool(10);

        for(int i=0;i<100;i++){
            executor.execute(new SumTask());
        }
    }
}
=======
package MultiThreading;
import java.util.concurrent.*;

/**
 * Created by sahoos on 8/1/2017.
 */
public class SumCalculator {
    public static void main(String[] args){

        ExecutorService executor =  Executors.newFixedThreadPool(10);

        for(int i=0;i<100;i++){
            executor.execute(new SumTask());
        }
    }
}
>>>>>>> 714f2ed2e981914d5597e2ea11c84a0e23936c54

<<<<<<< HEAD
package MultiThreading;

/**
 * Created by sahoos on 8/1/2017.
 */
public class SumTask implements Runnable{

    @Override
    public void run(){
        int sum = 0;
        for(int i=1;i<=500;i++)
            sum = sum + i;
        System.out.printf("SUM is %s%n",sum);
    }
}
=======
package MultiThreading;

/**
 * Created by sahoos on 8/1/2017.
 */
public class SumTask implements Runnable{

    @Override
    public void run(){
        int sum = 0;
        for(int i=1;i<=500;i++)
            sum = sum + i;
        System.out.printf("SUM is %s%n",sum);
    }
}
>>>>>>> 714f2ed2e981914d5597e2ea11c84a0e23936c54

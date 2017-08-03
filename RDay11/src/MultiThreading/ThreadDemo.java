package MultiThreading;

/**
 * Created by sahoos on 7/31/2017.
 */
public class ThreadDemo {
    int i = 0;
    public static void main(String[] args) {
        new ThreadDemo();
    }

    public ThreadDemo() {

            Thread thread1 = new Thread(() -> {
                for (int j = 0; j < 20; j++)
                    i++;
            });
            thread1.start();

            Thread thread2 = new Thread(() -> {
                for (int j = 0; j < 20; j++)
                    System.out.println(i);
            });
            thread2.start();
        }
    }


package MultiThreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sahoos on 7/31/2017.
 */
public class ReadFileThread {
    public static void main(String[] args) {
        TaskA taskA  = new TaskA();
        TaskB taskB  = new TaskB();

        Thread threadA = new Thread(taskA);
        threadA.start();

        Thread threadB = new Thread(taskB);
        threadB.start();
    }
}

class TaskA implements Runnable{

    public void run(){
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\training\\day11\\a.txt");
            int b = fis.read();
            while (b != -1) {
                System.out.println((char)b);
                b = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

class TaskB implements Runnable{

    public void run(){
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\training\\day11\\b.txt");
            int b = fis.read();
            while (b != -1) {
                System.out.println((char)b);
                b = fis.read();
            }
            System.out.println((char)b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

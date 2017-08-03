package MultiThreading;


/**
 * Created by sahoos on 7/31/2017.
 */
public class ThreadManipulation {
    public static void main(String[] args) {
        for(int i = 0; i<20 ; i++) {
            WorkerA workerA = new WorkerA(new ValueTask());
            WorkerB workerB = new WorkerB(new PrintTask());
            workerA.start();
            workerB.start();
        }
    }
}

class WorkerA extends Thread {
    ValueTask valueTask = null;

    public WorkerA(ValueTask valueTask) {
        this.valueTask = valueTask;
    }

    @Override
    public void run() {
        valueTask.run();
    }
}

class WorkerB extends Thread {

    PrintTask printTask = null;

    public WorkerB(PrintTask printTask) {
        this.printTask = printTask;
    }

    @Override
    public void run() {
        printTask.run();
    }
}

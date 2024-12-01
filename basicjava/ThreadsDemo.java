
class AThreadsDemo extends Thread {

    //this will initiated by start() method
    public void run() {
        for (int i=0; i<=10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // this in milliseconds
        }
    }
}

class BThreadsDemo extends Thread {

    //this will initiated by start() method
    public void run() {
        for (int i=0; i<=10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class ThreadsDemo {
    public static void main(String a[]) {
        AThreadsDemo aThreadsDemo = new AThreadsDemo();
        BThreadsDemo bThreadsDemo = new BThreadsDemo();


        // bThreadsDemo.setPriority(Thread.MAX_PRIORITY); 
        // start() method of a class that extends to Thread will run the run() method of that class;
        aThreadsDemo.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        bThreadsDemo.start();

    }
}
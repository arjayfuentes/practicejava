class Counter {
    int count;
    // this ensure that this method is called by different threads one at a time
    public synchronized void increment() {
        count++;
    }
}

//runnable don't have start() method
public class RaceDemo {
    public static void main(String a[]) throws InterruptedException {

        Counter c = new Counter();

        Runnable aRunnableDemo = () -> {
            for (int i=0; i<1000; i++) {
                c.increment();
            }
        };


        Runnable bRunnableDemo = () -> {
                for (int i=0; i<1000; i++) {
                    c.increment();
                }
        };

        Thread t1 = new Thread(aRunnableDemo);
        Thread t2 = new Thread(bRunnableDemo);

        t1.start();
        t2.start();

        //allow main thread for t1 and t2
        t1.join();
        t2.join();


        // try {
        //     Thread.sleep(2000);
        //     System.out.println(c.count);

        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        System.out.println(c.count);


    }
}
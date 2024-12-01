
//runnable is an interface so implement

// class ARunnableDemo implements Runnable {

//     //this will initiated by start() method
//     public void run() {
//         for (int i=0; i<=5; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             } // this in milliseconds
//         }
//     }
// }

// class BRunnableDemo implements Runnable {

//     //this will initiated by start() method
//     public void run() {
//         for (int i=0; i<=5; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }

//         }
//     }
// }


//runnable don't have start() method
public class RunnableDemo {
    public static void main(String a[]) {

        // through anonymous class in replacement of class ARunnableDemo
        Runnable aRunnableDemo = new Runnable() {
            public void run() {
                for (int i=0; i<=5; i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } // this in milliseconds
                }
            }
        };
        // lambda expression because Runnable is actually an functional interface
        // through lambda expressionin replacement of class ARunnableDemo
        Runnable bRunnableDemo = () -> {
                for (int i=0; i<=5; i++) {
                    System.out.println("hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
        
                }
        };

        Thread t1 = new Thread(aRunnableDemo);
        Thread t2 = new Thread(bRunnableDemo);

        //runnable don't have start() method
        t1.start();
        t2.start();

    }
}
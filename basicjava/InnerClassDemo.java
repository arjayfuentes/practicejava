
//outer class should not be static. 
//inner classes are the only class that can be static.

class AInnerClassDemo {

    int age;

    public void show() {
        System.out.println("in show");
    }

    // this is an inner class
    class BInnerClassDemo {

        public void config() {
            System.out.println("in config inner class BInnerClassDemo");
        }

    }

    // this is an inner class static
    static class CInnerClassDemo {

        public void config() {
            System.out.println("in config C inner class static CInnerClassDemo");
        }

    }
}

public class InnerClassDemo {
    public static void main(String a[]) {

        AInnerClassDemo aInnerClassDemo = new AInnerClassDemo();
        aInnerClassDemo.show();

        //to create object of inner class
        AInnerClassDemo.BInnerClassDemo aInnerClassDemo1= aInnerClassDemo.new BInnerClassDemo();
        aInnerClassDemo1.config();

        //to create object of inner class but static
        AInnerClassDemo.CInnerClassDemo aInnerClassDemo2 = new AInnerClassDemo.CInnerClassDemo();
        aInnerClassDemo2.config();
    }
}
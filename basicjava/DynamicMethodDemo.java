class ADynamicMethodDemo {
    public void show() {
        System.out.println("in A show");
    }
}

class BDynamicMethodDemo extends ADynamicMethodDemo{
    public void show() {
        System.out.println("in B show");
    }
}

class CDynamicMethodDemo  extends ADynamicMethodDemo {
    public void show() {
        System.out.println("in C show");
    }
}

public class DynamicMethodDemo {
    public static void main(String a[]) {

        
        ADynamicMethodDemo aDynamicMethodDemo = new ADynamicMethodDemo();
        aDynamicMethodDemo.show();

        //run-time polymorphism
        aDynamicMethodDemo = new BDynamicMethodDemo();
        aDynamicMethodDemo.show();

        //run-time polymorphism
        aDynamicMethodDemo = new CDynamicMethodDemo();
        aDynamicMethodDemo.show();

    }
}
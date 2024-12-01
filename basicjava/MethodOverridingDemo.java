class AMethodOverridingDemo {

    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in A config");
    }

}

class BMethodOverridingDemo extends AMethodOverridingDemo {

    //this override the method in parent class which is AMethodOverridingDemo. They have the same method name show

    public void show() {
        System.out.println("in B show");
    }
}


public class MethodOverridingDemo {
    public static void main (String a[]) {
        BMethodOverridingDemo b = new BMethodOverridingDemo();
        // below is method overriding . - it will use method in BMethodOverridingDemo instead of the class BMethodOverridingDemo extending to
        b.show(); 
        b.config();
    }
}
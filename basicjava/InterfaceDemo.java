

//all methods are public and abstract
//interface is not a class
//therefore you cannot instantiate an interface
interface AInterfaceDemo {

    //variables inside the interface is final and static, you can use this to the class which implements this interface
    int age = 44;
    String area = "Philippines";
    // public abstract void show();
    // public abstract void config();

    //methods inside the interface is public and abstract
    void show();
    void config();
    void accessVariableFromInterface();
}

//you use implements if you are extending to an interface
//all methods should be implemented. mandatory
class BInterfaceDemo implements AInterfaceDemo{

    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("in config");
    }

    public void accessVariableFromInterface() {
        System.out.println("Inherited variables from the interface, age: " +  age + " - area:" + area);
    }

}



public class InterfaceDemo {
    public static void main(String a[]) {
        //object instantiation is the class not the interface
        AInterfaceDemo aInterfaceDemo =  new BInterfaceDemo();
        aInterfaceDemo.show();
        aInterfaceDemo.config();
        aInterfaceDemo.accessVariableFromInterface();

        //this will work because variables of interface is static and final
        System.out.println(AInterfaceDemo.age);


        // this will not work since age is a variable in the interface
        // and variables in an interface are always final and static
        //aInterfaceDemo.age = 14; 

    }
}
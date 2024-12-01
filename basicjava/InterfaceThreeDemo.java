// class - class -> extends
// class - interface -> implements
// interface - interface -> extends


interface AInterfaceThreeDemo {

    // int age = 35;
    // String area = "Belgium";

    void show();
    void config();

}

interface BInterfaceThreeDemo {
    void run();
}

interface CInterfaceThreeDemo extends BInterfaceThreeDemo {
}

class BClass implements AInterfaceThreeDemo, CInterfaceThreeDemo {

    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public void show() {
        System.out.println("Show");

    }

    @Override
    public void config() {
        System.out.println("config");

    }

    
}





public class InterfaceThreeDemo {
    public static void main (String a[]) {
        
        //this cannot call .run() because it's the outermost interface and AInterfaceThreeDemo is not aware of the child
        AInterfaceThreeDemo obj = new BClass();
        System.out.println("By AInterfaceThreeDemo");
        obj.show();
        obj.config();

        System.out.println("By BInterfaceThreeDemo");
        BInterfaceThreeDemo obj1  = new BClass(); 
        obj1.run();
    }
}
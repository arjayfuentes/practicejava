interface ComputerDevice {

    void code();

}

class Laptop implements ComputerDevice{
    
    //method overriding
    public void code() {
        System.out.println("code, compile, run by Laptop");
    }
}

class Desktop implements ComputerDevice {

    //method overriding
    public void code() {
        System.out.println("code, compile, run by Desktop");
    }
}

class Developer {
    

    public void devApp(ComputerDevice comp) {
        comp.code();
    }
}



public class InterfaceTwoDemo {
    public static void main (String a[]) {  
        ComputerDevice laptop = new Laptop();
        ComputerDevice desktop = new Desktop();

        Developer developer1 = new Developer();
        developer1.devApp(desktop);
        
    }
}
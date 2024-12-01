
class APolymorphismDemo {
    
    public int multiplyByItself(int num) {
        return num * num;
    }
}

class BPolymorphismDemo extends APolymorphismDemo {
    
    public int multiplyByItself(int num) {
        return num * num * num;
    }

    public int add(int num) {
        return num + num;
    }

    public int add(int num, int num2) {
        return num + num2;
    }
}



public class PolymorphismDemo {
    public static void main (String a[]) {
        int num = 5;

        BPolymorphismDemo bPolymorphismDemo= new BPolymorphismDemo();

        // method overriding - Run Time polymorphism.
        System.out.println(bPolymorphismDemo.multiplyByItself(num));

        // method overloading - Compile Time polymorphism.
        System.out.println(bPolymorphismDemo.add(num,2));

    }
}
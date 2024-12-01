
class CalculatorOverloading {

    int a;

    //method overloading same method name but different argument types 
    //(first method only accepts 2 arguments, the second accepts 3 arguments)
    public int add (int num1, int num2) {
        return num1 + num2;
    }

    public int add (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // this will error because add with return int already defined 
    // public double add (int num1, int num2) {
    //     return num1 + num2;
    // }

}

public class DemoOverloading {
    public static void main(String a[]) {
        int num1 = 6;
        int num2 = 5;
        int num3 = 4;

        CalculatorOverloading calc = new CalculatorOverloading();

        int result = calc.add(num1, num2);
        System.out.println(result);

    }
}
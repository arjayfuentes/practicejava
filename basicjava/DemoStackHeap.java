
class CalculatorStackHeap {

    int a;

    public int add (int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

public class DemoStackHeap {
    public static void main(String a[]) {
        int num1 = 6;
        int num2 = 5;

        //int result = num1 + num2;
        CalculatorStackHeap calc = new CalculatorStackHeap();

        int result = calc.add(num1,num2);
        System.out.println(result);

    }
}
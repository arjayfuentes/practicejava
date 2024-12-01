// CalcFinalKeywordDemo cannot be extended by other class.

final class CalcFinalKeywordDemo {
    
    public void show() {
        System.out.println("in CalcFinalKeywordDemo Show");
    }

    public void add(int a, int b) {
        System.out.println(a+b);
    }
}

class CalcFinalKeywordFinalMethodDemo {
    
    //this method cannot be overriden by child class
    public final void show() {
        System.out.println("in CalcFinalKeywordFinalMethodDemo Show");
    }

    public void add(int a, int b) {
        System.out.println(a+b);
    }
}

//class AdvCalcFinalKeywordDemo extends CalcFinalKeywordDemo{ 
//this will not work because CalcFinalKeywordDemo is final and cannot be extended by other class.

class AdvCalcFinalKeywordDemo extends CalcFinalKeywordFinalMethodDemo{
    
    //this will not work since show() of CalcFinalKeywordFinalMethodDemo is final and cannot be overriden by child class
    // public void show() {
    //     System.out.println("in Calc Show");
    // }

    public void add(int a, int b) {
        System.out.println(a+b);
    }
}



public class FinalKeywordDemo {
    public static void main (String a[]) {
        final int num = 8;
        //num = 9; this will not work since num is already final which is 8. it cannot be changed.
        System.out.println(num);

        CalcFinalKeywordDemo calcFinalKeywordDemo = new CalcFinalKeywordDemo();
        calcFinalKeywordDemo.add(1,2);


    }
}

@FunctionalInterface // a functional interface is only 1 method
interface AFunctionalInterfaceDemo {
    void show();
    //void run(); // this will not work because functional interface have to only 1 method

}

@FunctionalInterface // a functional interface is only 1 method
interface BFunctionalInterfaceDemo {
    void show1(int num);
    //void run(); // this will not work because functional interface have to only 1 method

}


@FunctionalInterface // a functional interface is only 1 method
interface CFunctionalInterfaceDemo {
    int show2(int num, int num2);
    //void run(); // this will not work because functional interface have to only 1 method

}





public class FunctionalInterfaceDemo {
    public static void main(String a[]) {

        // AFunctionalInterfaceDemo obj = new AFunctionalInterfaceDemo() {
        //     public void show() {
        //         System.out.println("in show");
        //     }
        // };

        // a lambda expression. below is the simplified lambda expression of above inner class 
        AFunctionalInterfaceDemo obj = () -> {
                System.out.println("in show");
        };

        //you can also written above code with below 
        //AFunctionalInterfaceDemo obj = () -> System.out.println("in show");
        
        obj.show();

        // a lambda expression
        int num = 5;
        BFunctionalInterfaceDemo obj2 = i -> {
            System.out.println("in show num  is = " + i  );
        };

        //you can also written above code with below 
        //AFunctionalInterfaceDemo obj = i -> System.out.println("in show num  is = " + i  );
        obj2.show1(num);


        // a lambda expression
        int num1 = 5;
        int num2 = 6;
        CFunctionalInterfaceDemo obj3 = (n1, n2) -> n1 + n2;

        //you can also written above code with below 
        //AFunctionalInterfaceDemo obj = i -> System.out.println("in show num  is = " + i  );
        int result = obj3.show2(num1, num2);
        System.out.println(result);


        

    }
}
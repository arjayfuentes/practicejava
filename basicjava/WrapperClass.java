public class WrapperClass {
    public static void main (String a[]) {
        // primitive variable
        int num = 7;

        //Reference variable
        // below is autoboxing primtive to reference type
        Integer num1 = num;
        //Integer num1 = new Integer(num);

        System.out.println(num1);

        //below is auto-unboxing - reference type to primitive
        int num2 = num1;
        //int num2 = num1.intValue();

        System.out.println(num2);
        // parsing string to int
        String strNum = "12";
        int num3 = Integer.parseInt(strNum);
        System.out.println(num3);

    }
}
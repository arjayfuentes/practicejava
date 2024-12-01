class ArithmeticOperation {
    public static void main (String a[]) {
        int num1 = 6;
        int num2 = 4;
        int sumResult = 0;
        int differenceResult = 0;
        int multiplyResult = 0;
        int divisionResult = 0;
        int modResult = 0;


        sumResult = num1 + num2;
        differenceResult = num1 - num2;
        multiplyResult = num1 * num2;
        divisionResult = num1 / num2;
        modResult = num1 % num2;

        System.out.println("Sum: " + sumResult);
        System.out.println("Difference: " + differenceResult);
        System.out.println("Multiply: " + multiplyResult);
        System.out.println("Division: " + divisionResult);
        System.out.println("Mod: " + modResult); // mod is the remainder

        int incNum = 0;
        //incrementing value; 
        System.out.println(incNum++); //0  it print first before the execution of the operator ++
        System.out.println("value of incNum after printing above without ++ : " + incNum); 
        //1

        incNum = 0;
        System.out.println(++incNum); //1 it increment first before printing


    }
}
class DataTypes {
    public static void main(String a[]) {
        int num1 = 3;
        int num2 = 5;
        
        byte by = 127; // byte only up to 127
        short sh = 558;
        long l = 5854l; // add f to make it long
        //float num3 = 6.5;// this will give error
        float num3 = 6.5f;// add f to make it float
        double num4 = 6.543434;
        char c = 'k';
        boolean isTrue = true;
        System.out.println("Hello World");
        int sum = num1 + num2;
        System.out.println("int value: " + num1);
        System.out.println("byte value: " + by);
        System.out.println("short value: " + sh);
        System.out.println("long value: " + l);

        System.out.println("total on demand: "+ num1 + num2);
        System.out.println("total result: "+sum);
        System.out.println("float value: "+num3);
        System.out.println("double value: "+num4);
        System.out.println("char value: "+c);

        //casting
        int intNum = 257;
        byte castedByte = (byte) intNum; //  int casted to byte. it will only show 1 since byte limit is 256.
        System.out.println("casted byte from int: "+castedByte);

        float floatNum = 5.6f;
        int castedInt = (int) floatNum; //  it will only show the whole number disregarding the decimal value. in this case 5
        System.out.println("casted int from float: "+castedInt);

        //type promotion
        byte ab = 10;
        byte bb = 30;

        int result2 = ab * bb; // a and b are byte but due to the operation it is promoted to int.
        System.out.println(result2); // result 300
    }
}



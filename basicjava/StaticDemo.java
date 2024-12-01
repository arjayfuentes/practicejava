class Mobile {
    String brand;
    int price;
    static String name;

    
    // a static block only called once. regardless of how many object or intanse are created
    // static block is called before the constructor
    // Though if there’s not even one object is created static block will also not be called.
    static  {
        name = "Phone";
        System.out.println("in static block");
    }


    public Mobile() {
        brand = "";
        price = 200;
        //name = "Phone"; no need to call since it's already static
        System.out.println("in constructor");

    }

    //though this method is NON-static it can stil call a static variable
    public void show() {
        System.out.println(brand + " : " + name + " : " + price);
    }

   
    public static void show1() {
        //Since this is a static method. you can only use static variable here. Below sysout will show error. 
        // Error since brand and price is not static.
        // error: non-static variable brand cannot be referenced from a static context
        // why? - 
        // System.out.println(brand + " : " + name + " : " + price);

        //this will not show error since variable name is a static variable which is called inside the static method show1
        System.out.println(name);
    }


    public static void show2(Mobile mobile) {
        System.out.println(mobile.brand + " : " + mobile.name + " : " + mobile.price);
    }

}


public class StaticDemo {
    public static void main (String a[]) {
        Mobile mobile1 = new Mobile(); // called the constructor mobile 1st
        mobile1.brand = "Apple";
        mobile1.price = 1500;
        Mobile.name = "Smartphone"; // it's a static method that's why you don't need to create an instance.

        Mobile mobile2 = new Mobile(); // called the constructor mobile 2nd
        mobile2.brand = "Samsung";
        mobile2.price = 1400;
        Mobile.name = "Smartphone"; // it's a static method that's why you don't need to create an instance.

        Mobile.name = "Phone";

        mobile1.show();
        mobile2.show();

        Mobile.show1(); // you can call the method directly because it's static. 

        Mobile.show2(mobile1);
        Mobile.show2(mobile2);

    }
}
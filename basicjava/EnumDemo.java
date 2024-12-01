
//you cannot extend in your class even though enum is a class
enum Status {
    Running, Failed, Pending, Success;
}

enum LaptopBrand {
    Macbook (2000), Surface(2200), Thinkpad(1800), ArielLaptop;

    private int price;


    private LaptopBrand() {
        price = 500; // this will be the default price for enum item with no price. in this case ArielLaptop = 500
    }

    //by adding constructor error is gone -> error is because of parenthesis with price
    private LaptopBrand(int price) {
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}


public class EnumDemo {
    public static void main (String a[]) {
        int i = 5;

        Status status  = Status.Running;
        System.out.println(status);

        Status status2  = Status.Failed;
        System.out.println(status2);
        System.out.println(status2.ordinal());

        // Pring all status
        System.out.println("Printing all status: ");
        Status [] statuses = status.values();
        for(Status stat : statuses) {
            System.out.println(stat.ordinal() + ": " + stat);
        }

        System.out.println("From if else");

        //if else 
        if(status == Status.Running) {
            System.out.println("All Good");
        } else if (status == Status.Failed) {
            System.out.println("Try Again");
        } else if (status == Status.Pending) {
            System.out.println("Please Wait");
        } else {
            System.out.println("Done");
        }

        //switch
        System.out.println("From switch");

        switch(status) {
            case Running:  System.out.println("All Good");
                break;
            case Failed:  System.out.println("Try again");
                break;
            case Pending:  System.out.println("Please Wait");
                break;
            default:  System.out.println("Done");
                break;
        }


        System.out.println(status.getClass().getSuperclass());

        LaptopBrand lap = LaptopBrand.Macbook;
        System.out.println(lap.getPrice());


        LaptopBrand [] laptops = LaptopBrand.values();

        for(LaptopBrand laptopbrand : laptops) {
            System.out.println(laptopbrand + " price is " + laptopbrand.getPrice() + " = " + laptopbrand.name());
        }
    }
}
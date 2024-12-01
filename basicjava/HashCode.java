class LaptopHashCode {
    String name;
    int price;

    public boolean equals(LaptopHashCode lap) {
        // Object type use equals but for primitive use ===
        if(this.name.equals(lap.name) && this.price == lap.price) {
            return true;
        }
        return false;

        // i can do above line with below
        // return this.name.equals(lap.name) && this.price == lap.price;
    }

    //below methods are auto generated from source action selecting Create hashCode and equals()
    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((name == null) ? 0 : name.hashCode());
    //     result = prime * result + price;
    //     return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     LaptopHashCode other = (LaptopHashCode) obj;
    //     if (name == null) {
    //         if (other.name != null)
    //             return false;
    //     } else if (!name.equals(other.name))
    //         return false;
    //     if (price != other.price)
    //         return false;
    //     return true;
    // }

}


class LaptopOverrideToStringHashCode {
    String name;
    int price;

    public String toString() {
        return "I override the toString method";
    }

}

public class HashCode {
    public static void main(String a[]) {
        LaptopHashCode laptopHashCode = new LaptopHashCode();
        laptopHashCode.name = "Lenovo";
        laptopHashCode.price = 1000;


        LaptopHashCode laptopHashCode2 = new LaptopHashCode();
        laptopHashCode2.name = "Lenovo";
        laptopHashCode2.price = 1000;

        LaptopHashCode laptopHashCode3 = new LaptopHashCode();
        laptopHashCode2.name = "Lenovo";
        laptopHashCode2.price = 1500;

        //both sysout are printing hashcode
        System.out.println(laptopHashCode);
        System.out.println(laptopHashCode.toString());

        boolean compareEqualResult = laptopHashCode == laptopHashCode2;
        //this will be false since you use ===
        System.out.println("Equality of same value through === : " + compareEqualResult);

        //to compare use .equals - which is an override method that check individual variables if equals
        boolean compareEqualResultByDotEquals = laptopHashCode.equals(laptopHashCode2);
        System.out.println("Equality of same value through .equals : " + compareEqualResultByDotEquals);

        boolean compareEqualResultByDotEquals2 = laptopHashCode.equals(laptopHashCode3);
        System.out.println("Equality of same value through .equals comparing laptopHashCode3 : " + compareEqualResultByDotEquals2);


        LaptopOverrideToStringHashCode laptopOverrideToStringHashCode = new LaptopOverrideToStringHashCode();

        //both sysout from the override toString()
        System.out.println(laptopOverrideToStringHashCode);
        System.out.println(laptopOverrideToStringHashCode.toString());


    }
}

// abstract class may or may not have an abstract method
abstract class CarDemo {
   
   public abstract void drive();
   public abstract void fly();

   public void playMusic() {
       System.out.println("play music");
   }

}

//since this is an abstract class it;s not mandatory to implement the abstract methods it inherited
abstract class WagonDemo extends CarDemo {

    public void drive() {
        System.out.println("Wagon driving");
    }

}

//since this is NOT an abstract class then all abstract methods it inherited should be implemented.
//this is a concrete class
class UpdateWagonDemo extends WagonDemo {


    public void fly() {
        System.out.println("UpdateWagonDemo flying");
    }

    public void drive() {
        System.out.println("UpdateWagonDemo driving");
    }
}



public class AbstractDemo {
   public static void main(String a[]) {
    //below does not work since you cannot instantiate an abstract class;

    CarDemo carDemo = new UpdateWagonDemo();
    carDemo.drive();
    carDemo.playMusic();
   }
}
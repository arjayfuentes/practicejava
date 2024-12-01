

class AAnonymousInnerClassDemo {


    public void show() {
        System.out.println("in show A");
    }

    
}

// class BAnonymousInnerClassDemo extends AAnonymousInnerClassDemo{
//     public void show() {
//         System.out.println("in show B");
//     }
// }


public class AnymousClassDemo {
    public static void main (String a[]) {
        AAnonymousInnerClassDemo aAnonymousInnerClassDemo = new AAnonymousInnerClassDemo() {

            //this is anonymous class because it has no name.


            public void show() {
                System.out.println("in anonymous inner class"); // as a replacement of BAnonymousInnerClassDemo
                //you don't need to create a new class 
                //
            }
        };
        aAnonymousInnerClassDemo.show();
    }
}
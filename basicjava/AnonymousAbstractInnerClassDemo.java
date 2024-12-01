

abstract class AAnonymousAbstractInnerClassDemo {


    public abstract void show() ;
    
}


// class BAnonymousAbstractInnerClassDemo extends AAnonymousAbstractInnerClassDemo{
//     public void show() {
//         System.out.println("in show B");
//     }
// }



class AnonymousAbstractInnerClassDemo {
    public static void main (String a[]) {
        AAnonymousAbstractInnerClassDemo aAnonymousAbstractInnerClassDemo = new AAnonymousAbstractInnerClassDemo() {
            public void show() {
                System.out.println("in show Anonymous Inner class");
            }

            public void config() {
                System.out.println("in show Config Anonymous Inner class");
            }
        };
        aAnonymousAbstractInnerClassDemo.show();
    }
}
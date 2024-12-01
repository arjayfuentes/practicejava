class AAnnotationDemo {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in A show");
    }
}

class BAnnotationDemo extends AAnnotationDemo {

    @Override //to make sure that compiler check that you really overriding the method from parent
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}



public class AnnotationDemo {
    public static void main(String a[]) {
        BAnnotationDemo bAnnotationDemo = new BAnnotationDemo();
        bAnnotationDemo.showTheDataWhichBelongsToThisClass();
    }
}
class ACastingDemo {

    public void show1() {
        System.out.println("in A show");
    }

}


class BCastingDemo extends ACastingDemo{
    
    public void show2() {
        System.out.println("in B show");
    }

}




public class CastingDemo {
    public static void main (String a[]) {

        //this is type casting
        double d = 4.5;
        int i = (int) d;

        System.out.println(i);

        // up casting BCastingDemo to ACastingDemo
        ACastingDemo aCastingDemo = (ACastingDemo) new BCastingDemo();
        aCastingDemo.show1();

        // dpwn casting ACastingDemo to BCastingDemo
        BCastingDemo bCastingDemo2 = (BCastingDemo) aCastingDemo;
        bCastingDemo2.show2();



    }
}
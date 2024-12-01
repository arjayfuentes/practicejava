class HumanConstructor {

    private int age;
    private String name;

    //paremeterized constructor
    public HumanConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //default constructor
    public HumanConstructor() {
        age = 12;
        name = "John";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


public class ConstructorDemo {

    public static void main(String a[]) {

        //this will show default value in this case John and 12 because you use constructor with no parameter
        HumanConstructor human1 = new HumanConstructor();
        System.out.println("Name: "+ human1.getName() + " - age: " + human1.getAge());

        HumanConstructor human2 = new HumanConstructor(35,"Ariel");
        System.out.println("Name: "+ human2.getName() + " - age: " + human2.getAge());


    }
    
}
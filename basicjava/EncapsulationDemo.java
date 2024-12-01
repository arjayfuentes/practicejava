class Human {

    // encapsulation - variables is private so to not directly use the variable.
    private int age;
    private String name;

    //this - is the instance
    //shortcut in VS right click source action -. then generate getters and setters
    //this is use to say that we are talking about the instance variable
    public int getAge() {
        return age;
    }

    //this.age - instance variable, age is local variable
    public void setAge(int age) {
        // age =age - is just assigning the value to itself.
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}


public class EncapsulationDemo {

    public static void main(String a[]) {

        Human human1 = new Human();
        human1.setName("Ariel");
        human1.setAge(35);
        System.out.println("Name: "+ human1.getName() + " - age: " + human1.getAge());

    }
    
}
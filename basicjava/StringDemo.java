class StringDemo {
    public static void main (String a[]) {

        //String without explicitly creating an object.  
        //Java do in implicitly creating an object in the background
        String normalString = "normalString";
        System.out.println(normalString);
        System.out.println(normalString.charAt(0));
        System.out.println(normalString.length());


        String objectString = new String("objectString");
        System.out.println(objectString);
        System.out.println(objectString.charAt(0));
        System.out.println(objectString.concat(" concatinatedString"));
        System.out.println(objectString.length());

        //Immutable - String
        String name  = "Jay";
        name = "Ariel" + name; 
        // this will create a new object. changing the address not changing the data. 
        // the data of the original name which is Jay still exist. line 20 will create a new object in the heap
        // which will have the value ArielJay. the name reference to ArielJay instead of Ariel.
        // the object with just Jay will be garbage collected later.
        System.out.println(name);

        //the object is only 1. because it has the same value. they have the same value but difference reference 
        String s1 = "Ariel";
        String s2 = "Ariel";

        System.out.println(s1 == s2);

        //Mutable - StringBuffer - not thread safe
        StringBuffer stringB = new StringBuffer();
        stringB.append("Ariel");
        stringB.insert(5, "Jay");
        stringB.setLength(20);

        System.out.println(stringB);

        //Mutable - StringBuilder  - thread safe
        StringBuilder stringBd = new StringBuilder();
        stringBd.append("Ariel");
        stringBd.insert(5, "Jay");
        stringBd.setLength(20);


    }
}
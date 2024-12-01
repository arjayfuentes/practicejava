import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String a[]) {
        Map<String,Integer> students = new HashMap<String,Integer>();
        
        // you can also use HashTable is you want it to be synchronized
        //Map<String,Integer> students = new HashMap<String,Integer>();

        //in map to add value use put() method
        // keys cannot be duplicate , in this casee the name - Map<K,V> - K -> key,  V -> Value
        students.put("Ariel",85);
        students.put("Jay",24);
        students.put("Fuentes",21);
        students.put("Tanag",16);

        // this will print out like this - {Jay=24, Fuentes=21, Ariel=85, Tanag=16}
        System.out.println(students);

        // this will print like this - [24, 21, 85, 16]
        System.out.println(students.values());
        
        // this will print like this [Jay, Fuentes, Ariel, Tanag]
        System.out.println(students.keySet());

        // printing map through keys with .keySet()
        for(String key: students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }


        

    }
}
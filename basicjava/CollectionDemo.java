import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class CollectionDemo {
    public static void main(String a[]) {

        System.out.println("LISTS");


        /*Link*/

        //Integer is generics - here specify the generic Integer
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        //printing out in bracket like an integer [6, 5, 8, 2]
        System.out.println(nums);

        //printing in enchanced loop
        for(Integer integer : nums) {
            System.out.println(integer.intValue());
        }

        System.out.println("SETS");


        /*Set - is a collection with unique value/item */
        // sets will not give you a sorted value. It doesn't have index value. 
        Set<Integer> setNums = new HashSet<Integer>();

        // if you want sorted you can TreeSet<>()
        // Set<Integer> setNums = new HashSet<Integer>();

        setNums.add(6);
        setNums.add(5);
        setNums.add(8);
        setNums.add(2);

        //printing in enchanced loop
        for(Integer integer : setNums) {
            System.out.println(integer.intValue());
        }


        System.out.println("Through iterator printing a collection");


        //other way of looping through a collection

        Iterator<Integer> values = setNums.iterator();

        while(values.hasNext()) {
            System.out.println(values.next());
        }


    }
}
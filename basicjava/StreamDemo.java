import java.util.Arrays;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String a[]) {


        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);


        System.out.println("Printing the array through normal for loop");
        // normal for loop printing
        for(int i=0;i<nums.size();i++) {
            System.out.println(nums.get(i));
        }

        System.out.println("Printing the array through enchanced for loop");
        // enhanced for loop printing
        for(int n: nums) {
            System.out.println(n);
        }

        System.out.println("Printing the array through forEach method");
        // forEach method printing
        nums.forEach(n -> System.out.println(n));


        //Consumer interface
        // Consumer<Integer> con = new Consumer<Integer> () {
        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }
        // };

        // lambad expression of above Consumer 
        Consumer<Integer> con = (n) ->  System.out.println(n);


        System.out.println("Printing the array through Consumer interface");
        // Consumer interface printing
        nums.forEach(con);

        System.out.println("Printing the array without Consumer interface and just forEach");
        // printing without the need of consumer interface just forEach
        //actually the forEach above can be written in way below without even needing the consumer method.
        nums.forEach(n ->  System.out.println(n));

        // printing through streams


        /* 
        Stream<Integer> s1 = nums.stream();
        // below filter even numbers;
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        // summation of all the list
        int result = s3.reduce(0,(c,e) -> c+e);
        */

        // Predicate<Integer> pred = new Predicate<Integer>() {
        //     public boolean test(Integer n) {
        //         return n%2==0;
        //     }
        // };

        // lambda expression of above code.
        Predicate<Integer> pred = n -> n%2==0;

        // Function<Integer, Integer> func = new Function<Integer, Integer>() {
        //     public Integer apply(Integer integer) {
        //         return n*2;
        //     }
        // };

        // lambda expression of above code.
        Function<Integer, Integer> func = n -> n*2;

        // the above lines line 55 to line 60 can be replace with codes below.
        int result = nums.stream()
            // below line can be written from below code
            //.filter(n -> n%2==0)
            .filter(pred)
            // below line can be written from below code
            //.map(n -> n*2)
            .map(func)
            .reduce(0, (c,e) -> c+e);

        // sample code for sorting values

       /* Stream<Integer> sortedValues= 
                // code below can be written with this. for thread
                // nums.parallelStream() 
                 nums.stream()
                .filter(pred)
                .map(func)
                //below is to sort values
                .sorted();

        sortedValues.forEach(n -> System.out.println(n));
        */
           

        // will print out 24
        System.out.println("Result of streams : " + result);

        System.out.println("Printing through streams");


        //s1.forEach(n ->  System.out.println(n));

        //you can only perform a stream only once. so below code will not work since above already did it.
        //s1.forEach(n ->  System.out.println(n));

        // printing only filtered number which are those even numbers
        // s2.forEach(n ->  System.out.println(n));

        // printing only filtered number but twice
        // s3.forEach(n ->  System.out.println(n));

















        
        // int sum = 0;
        // for(int n: nums) {
            
        //     //check if even
        //     if(n%2==0) {
        //         n = n*2;
        //         sum+= n;
        //     }
        // }
        // System.out.println(nums);

        
    }
}
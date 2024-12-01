import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class StudentDemo implements Comparable<StudentDemo> {

    int age;
    String name;

    
    public StudentDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDemo [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(StudentDemo studentDemo) {
        if(this.age > studentDemo.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class ComparatorAndComparableDemo {
    public static void main(String a[]) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);

        // to sort a collection

        System.out.println("Sorting by default sorting . Collections.sort()");

        Collections.sort(nums);

        System.out.println(nums);

        //custom sort base on the last digit through Comparator

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i%10 > j%10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };


        System.out.println("Sorting by custom Comparator");

        // Using the custom comparator to sort the list
        Collections.sort(nums, comp);

        System.out.println(nums);


        // List with custom object
        List<StudentDemo> studentsDemo = new ArrayList<StudentDemo>();
        studentsDemo.add(new StudentDemo(12,"Levi"));
        studentsDemo.add(new StudentDemo(16,"Naruto"));
        studentsDemo.add(new StudentDemo(56,"Ichigo"));
        studentsDemo.add(new StudentDemo(85,"Lupin"));

        System.out.println("Printing UNSORTED StudentsDemo");

        System.out.println(studentsDemo);

        for(StudentDemo s: studentsDemo) {
            System.out.println(s.age + " : " + s.name);
        }


        //custom sort base on age through Comparator
        // Comparator<StudentDemo> compStudentDemo = new Comparator<StudentDemo>() {
        //     public int compare(StudentDemo i, StudentDemo j) {
        //         if(i.age > j.age) {
        //             return 1;
        //         } else {
        //             return -1;
        //         }
        //     }
        // };

        // you can use this below lambda expression to replace above anonymous class 
        Comparator<StudentDemo> compStudentDemo = (StudentDemo i, StudentDemo j) -> i.age > j.age ? 1 : -1;


        //Sorting students by age
        Collections.sort(studentsDemo, compStudentDemo); 

        System.out.println("Printing SORTED StudentsDemo");

        for(StudentDemo s: studentsDemo) {
            System.out.println(s.age + " : " + s.name);
        }

    }
}
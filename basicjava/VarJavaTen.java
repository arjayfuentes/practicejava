import java.util.ArrayList;


class Alien {
    
}

public class VarJavaTen {

    //this will not work because var only works in local variable not in class;
    //var num = 10;
    public static void main(String a[]) {

        
        int numa = 9;

        // new var - no type
        // only applicable on local variables
        var numb = 8;


        int numc;

        // these will not work because a var should assign a value;
        //var numd;

        var numd = 10;


        // var obj = new ArrayList<>();

        String var = "Ariel"; // you can use var as a variable name

        int nums[] = new int[10];
        //above code can now be written below with var. You must removed the bracket on the left if you use var in an array
        // var nums = new int[10]

        Alien objAlien = new Alien();
        //above code can now be written below with var. 
        // var obj = new Alien()
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ExceptionWithReaderDemo  {
    public static void main (String a[]) throws NumberFormatException, IOException{

        
        int num = 0;
        BufferedReader bReader = null;
        try {
            System.out.println("Enter a number");
            bReader = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(bReader.readLine());
        } finally {
            System.out.println("Bye");
            // closing the resource
            // finally is use to closed the resource. in this case BufferedReader
            bReader.close();
        }


        //the above code can also be written in this way. This will automatically close the resources, eliminating the need for a finally block.
        try (BufferedReader bReader1 = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a number");
            num = Integer.parseInt(bReader1.readLine());
        } 
        
    }
}
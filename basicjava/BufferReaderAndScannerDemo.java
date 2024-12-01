import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReaderAndScannerDemo {

    public static void main (String a[]) throws IOException{
        System.out.println("Enter a number");

        // * this way is not a reliable way to ask for input Use BufferedReader
        // //if you enter 5
        // int num = System.in.read();
        // //this will show 53 which is the ascii value of 5.
        // System.out.println(num);

        //*  There's another way other than BufferedReader which is Scanner
        // InputStreamReader input = new InputStreamReader(System.in);
        // BufferedReader bufferedReader = new BufferedReader(input);
        // int num = Integer.parseInt(bufferedReader.readLine());
        // int num = Integer.parseInt(bufferedReader.readLine());


        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(num);

    }
    
}
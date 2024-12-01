class NavigationException extends Exception{
    
    public NavigationException(String string) {
        super(string);
    }
}

// throws 
class AExceptionDemo {
    public void show() throws ClassNotFoundException{
        Class.forName("NoneExistingClass");
    }
}



public class ExceptionDemo {

    public static void main (String a[]) {


        //you should handle the Exception because there's an exception in AExceptionDemo.
        // the exception throws ClassNotFoundException from AExceptionDemo to this main class (ExceptionDemo)
        AExceptionDemo aExceptionDemo = new AExceptionDemo();
        try {
            aExceptionDemo.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Start of new set of error");
        int i = 0;
        int j = 0;

        int []  nums = new int[5];
        String str = null;
        try {
            

           // System.out.println(str.length()); // error because of null. 
            //NullPointerException: but just for the purpose of this sample lets just put it inside generic Exception

            if(j==0) {
                throw new NavigationException("I don't want to print zero");
            }

            j = 18/i; // arithmetic error
            System.out.println(nums[5]); // out of bounce error

        } catch (NavigationException e) {
            j=18/1;
            System.out.println("Something went wrong. Custom Exception. The error is " + e);
        } catch (ArithmeticException e) {
            j=18/1;
            System.out.println("Something went wrong. The error is " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong. The error is " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong" + e);
        } 
        // finally will be called either exception happen or not
        // finally is use to close the resource
        finally {
            System.out.println("Finally block");
        }

        // if you put first the generic Exception e. the rest is not needed. in this example ArithmeticException and ArrayIndexOutOfBoundsException

        System.out.println(j);
    }


                                    
}
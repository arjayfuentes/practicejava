class LogicalOperators {
    public static void main (String a[]) {
        boolean isTrue = true;
        boolean isTrue2 = false;

        //AND operator &&
        if(isTrue && isTrue2) {
            System.out.println("Both are true : ");
        } else if(isTrue && !isTrue2) {
            System.out.println("Only isTrue is true ");
        } else if(!isTrue && !isTrue2) {
            System.out.println("Both are false");
        } else {
            System.out.println("Only isTrue2 is true ");
        }

        //OR operator ||
        if(isTrue || isTrue2) { //it will true if either is true
            System.out.println("Either one of them is true");
        } else {
            System.out.println("None of them are true");
        }

        //! operator 
        System.out.println("The value of isTrue : " + isTrue + ". But the inverted is :  "+ !isTrue);
        System.out.println("The value of isTrue2 : " + isTrue2 + ". But the inverted is :  "+ !isTrue2);
    }
}
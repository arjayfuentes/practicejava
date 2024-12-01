class IfElseSwitch {
    public static void main (String a[]) {
        int intNum = 3;

        //ifElse
        if(intNum==1) {
            System.out.println("IfElse Value : " + 1);
        } else if(intNum==2) {
            System.out.println("IfElse Value : " + 2);
        } else if (intNum == 3) {
            System.out.println("IfElse Value : " + 3);
        } else {
            System.out.println("IfElse Invalid value : " + intNum);
        }

        //switchCase
        switch (intNum) {
            case 1: System.out.println("SwitchCase Value : " + 1);
                break;
            case 2: System.out.println("SwitchCase Value : " + 2);
                break;
            case 3: System.out.println("SwitchCase Value : " + 3);
                break;
            default: System.out.println("SwitchCase Invalid value : " + intNum);
                break;
        }

        boolean isZero = false;
        //ifElse dual option 
        if(intNum!=0) {
            isZero = false;
        } else {
            isZero = true;
        }
        System.out.println("isValue Zero: "+isZero);


       //ternary operator
       isZero = intNum!=0 ? false : true;
        System.out.println("isValue Zero: "+isZero);

        
    }
}
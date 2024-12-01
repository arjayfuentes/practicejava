public class InheritanceDemo {

    public static void main (String a[]) {

        // Calc is a parent class
        Calc calc = new Calc();
        int c1 = calc.add(2,3);
        int c2 = calc.subtract(3,2);

        System.out.println("Calc instance add: " + c1);
        System.out.println("Calc instance subtract: " + c2);

        // AdvanceCalc - is a subclass, AdvanceCalc extends to Calc class inheriting the methods of Calc.
        AdvancedCalc advancedCalc = new AdvancedCalc();
        int ac1 = advancedCalc.add(2,3);
        int ac2 = advancedCalc.subtract(3,2);
        int ac3 = advancedCalc.multiply(2,3);
        int ac4 = advancedCalc.divisiion(3,2);
        advancedCalc.calcMethod();;

        System.out.println("AdvancedCalc instance add: " + ac1);
        System.out.println("AdvancedCalc instance subtract: " + ac2);
        System.out.println("AdvancedCalc instance multiply: " + ac3);
        System.out.println("AdvancedCalc instance division: " + ac4);

        // ScientificCalc inherited not only the methods of AdvanceCalc but also Calc 
        // since ScientificCalc extends to AdvanceCalc which extends to Calc
        ScientificCalc scientificCalc = new ScientificCalc();
        int sc1 = scientificCalc.add(2,3);
        int sc2 = scientificCalc.subtract(3,2);
        int sc3 = advancedCalc.multiply(2,3);
        int sc4 = advancedCalc.divisiion(3,2);
        double sc5 = scientificCalc.power(2,3);
        System.out.println("ScientificCalc instance add: " + sc1);
        System.out.println("ScientificCalc instance subtract: " + sc2);
        System.out.println("ScientificCalc instance multiply: " + sc3);
        System.out.println("ScientificCalc instance division: " + sc4);
        System.out.println("ScientificCalc instance power: " + sc5);

        


    }
}
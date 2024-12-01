class Loops {

    public static void main (String a[]) {
        int loopInt = 0;

        while(loopInt <=5 ) {
            System.out.println("While Loop " + loopInt);
            loopInt++;
        }

        //loopInt = 5 
        while(loopInt <=4 ) {
            System.out.println("While Loop with loopInt " + loopInt);
            loopInt++;
        } // this will skip


        do {
            System.out.println("DoWhile Loop with loopInt " + loopInt);
            loopInt++;
        } while (loopInt<=5); 
        // this will NOT skip. it will output once. because the checking of dowhile loop is at the end


        for(int forLoopInt=0; forLoopInt<=5; forLoopInt++) {
            System.out.println("for Loop " + forLoopInt);
        }

        for(;loopInt>=5; loopInt--) {
            System.out.println("for Loop with variable loopInt " + loopInt);
        }
    }
}
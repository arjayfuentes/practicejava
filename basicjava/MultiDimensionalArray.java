class MultiDimensionalArray {

     //5 2 6 1
     //3 2 1 7
     //4 8 1 2

    public static void main (String a[]) {
        int nums[][] = new int [3][4];
        
        //storing values to multi dimensional array - 
        for (int i=0; i<3;i++) {
            for(int j=0; j<4;j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.println(nums[i][j]);
            }
        }

        // manual loop
        for (int i=0; i<3;i++) {
            for(int j=0; j<4;j++) {
                System.out.println(nums[i][j]);
            }
        }

        System.out.println("Looping through array");

        //enhanced for loop
        for(int n[]: nums) {
            for (int m: n) {
                System.out.println(m);
            }
        }

    }
}
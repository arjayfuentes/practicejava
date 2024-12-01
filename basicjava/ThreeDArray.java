class ThreeDArray {
    
    public static void main(String a[]) {
        int nums[][] = new int [3][]; //jagged array - array with each item with different length

        nums[0] = new int [3];
        nums[1] = new int [4];
        nums[2] = new int [2];
        


        
        //storing values to multi dimensional array - 
        for (int i=0; i<nums.length;i++) {
            for(int j=0; j<nums[i].length;j++) {
                nums[i][j] = (int) (Math.random() * 100);
                System.out.print(nums[i][j] +  ", ");
            }
            System.out.println("");
        }

        System.out.println("Looping manually array");


        // manual loop
        for (int i=0; i<nums.length;i++) {
            for(int j=0; j<nums[i].length;j++) {
                System.out.print(nums[i][j] +  ", ");
            }
            System.out.println("");

        }

        System.out.println("Looping enhanced loop array");

        //enhanced for loop - in this case you don't need to specifiy length because if enchance loop. 
        //that's the beauty of enhanced loop
        for(int n[]: nums) {
            for (int m: n) {
                System.out.print(m +  ", ");
            }
            System.out.println("");

        }
    }
}
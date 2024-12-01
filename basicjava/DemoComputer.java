class Computer {
    public void playMusic() {
        System.out.println("Music Playing....");
    }
    
    public String getMeAPen(int cost) {
        if(cost >= 10) {
            return "Pen";
        } else {
            return "Nothing";
        }
    }
}


public class DemoComputer {

    public static void main (String a[]) {
        

        Computer computer = new Computer();
        computer.playMusic();
        String str = computer.getMeAPen(2);
        System.out.println(str);
    }

}
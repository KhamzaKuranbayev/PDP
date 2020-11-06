import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        boolean b = true;
        int point = 10;
        while (b) {
            LocalTime localTime = LocalTime.now();
            System.out.println("Stop");
            boolean b1 = true;
            while (b1) {
                if (LocalTime.now().getSecond() == localTime.getSecond() + 3) {
                    localTime = LocalTime.now();
                    b1 = false;
                }
            }
            System.out.println("Wait");
            boolean b2 = true;
            while (b2) {
                if (LocalTime.now().getSecond() == localTime.getSecond() + 1) {
                    localTime = LocalTime.now();
                    b2 = false;
                }
            }
            System.out.println("Go!");
            boolean b3 = true;
            while (b3) {
                if (LocalTime.now().getSecond() == localTime.getSecond() + 2) {
                    localTime = LocalTime.now();
                    b3 = false;
                }
            }
            System.out.println("\n||====================================================================================||");
            boolean b4 = true;
            while (b4) {
                if (LocalTime.now().getSecond() == localTime.getSecond() + 1) {
                    localTime = LocalTime.now();
                    b4 = false;
                }
            }
            point -= 1;
            if (point == 0) {
                b = false;
            }
        }
    }
}

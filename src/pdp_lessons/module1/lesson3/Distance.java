package pdp_lessons.module1.lesson3;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextDouble();
        double distance = scanner.nextDouble();

        double speed = (distance * 1000) / (time * 60); // V = S / t;
        System.out.println(speed);
    }
}






package pdp_lessons;

import java.util.Scanner;

public class EkukEkub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("EKUK = " + getEkuk(a, b) + " EKUB = " + getEkub(a, b));
    }

    public static int getEkuk(int a, int b) {
        // 45 60 180
        int max = Math.max(a, b);
        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0)
                return i;
        }
        return 0;
    }

    public static int getEkub(int a, int b) {
        // 45 60 -> 15 12 24
        int min = Math.min(a, b);
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 0;
    }
}

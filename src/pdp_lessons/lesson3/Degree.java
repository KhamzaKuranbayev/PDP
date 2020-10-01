package pdp_lessons.lesson3;

import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        a *= a; // 1
        a *= a; // 2
        System.out.println(a);

        long aa = scanner.nextLong();
        long c = aa * aa;  // 1
        long b = c * aa;  // 2
        c = b * b;  // 3
        System.out.println(c);

        c *= c;  // 4
        b *= c;  // 5
        System.out.println(b);
    }
}

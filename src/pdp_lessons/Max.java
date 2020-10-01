package pdp_lessons;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        do {
            n = scanner.nextInt();
            if (n == 0)
                break;

            if (n > max)
                max = n;

            if (n < min)
                min = n;
        } while (true);

        System.out.println(max + " ," + min);
    }
}

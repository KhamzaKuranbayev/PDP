package jetbrains_academy;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double[] v = new double[n];
        v[0] = 0;
        v[1] = 0;
        v[2] = 1.5;

        for (int i = 3; i < n; i++) {
            v[i] = (((i + 1) * v[i - 1]) / (i * i + 1)) - v[i - 2] * v[i - 3];
        }
        System.out.println(v[n-1]);

    }
}

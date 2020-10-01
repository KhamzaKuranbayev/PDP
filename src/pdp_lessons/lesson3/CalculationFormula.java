package pdp_lessons.lesson3;

import java.util.Scanner;

public class CalculationFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // n+nn+nnn+nnnn
        String n = number + "";
        String nn = n + n;
        String nnn = nn + n;
        String nnnn = nnn + n;

        int result = Integer.parseInt(n) + Integer.parseInt(nn) +
                Integer.parseInt(nnn) + Integer.parseInt(nnnn);

        System.out.println(n + " + " + nn + " + " + nnn + " + " + nnnn + " = " + result);
    }
}


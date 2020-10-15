package jetbrains_academy;

import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sum = 0;
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int count = 0;
        int triple = 0;
        for (int i = 0; i < size - 1; i++) {
            if (numbers[i + 1] - numbers[i] == 1) {
                count++;
                if (count == 2) {
                    triple++;
                    count = 0;
                    i = i - 1;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(triple);
    }
}

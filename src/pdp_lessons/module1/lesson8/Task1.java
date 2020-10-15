package pdp_lessons.module1.lesson8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        if(isInMassive(number, arr)) {
            System.out.println("Element massiv ichida bor");
        } else {
            System.out.println("Element massiv ichida yo'q");
        }

    }

    public static boolean isInMassive(int number, int[] arr) {
        for (int num : arr) {
            if (num == number)
                return true;
        }
        return false;
    }

}

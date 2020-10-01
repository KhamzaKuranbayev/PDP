package pdp_lessons.lesson8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv o'lchamini kiriting: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Massivda " + evenNumbers(arr) + " ta juft son bor");
    }

    public static int evenNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                count++;
        }
        return count;
    }

}

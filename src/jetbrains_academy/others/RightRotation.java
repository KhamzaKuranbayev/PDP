package jetbrains_academy.others;

import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] entrance = scanner.nextLine().split(" ");
        int numberOfRotation = scanner.nextInt();

        int a = 0;
        int[] numbers = new int[entrance.length];
        for (String test: entrance) {
            numbers[a++] = Integer.parseInt(test);
        }

        numberOfRotation = numberOfRotation % numbers.length;
        int[] result = new int[numbers.length];

        int j = 0;
        for (int i = numbers.length - numberOfRotation; i < numbers.length; i++) {
            result[j] = numbers[i];
            j++;
        }

        int k = numberOfRotation;
        for (int i = 0; i < numbers.length - numberOfRotation; i++) {
            result[k] = numbers[i];
            k++;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(result[i] + " ");
        }


    }
}


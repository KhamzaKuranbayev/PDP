package jetbrains_academy.matrix.fillMatrix;

import java.util.Scanner;

public class FirstWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.abs(j - i);
            }
        }

        for (int[] subArray : matrix) {
            for (int i : subArray) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

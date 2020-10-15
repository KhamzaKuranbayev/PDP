package jetbrains_academy.matrix;

import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; i + j < n; j++) {
                matrix[j][i + j] = i;
                matrix[i + j][j] = i;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 0 1 2 3 4
        // 1 0 1 2 3
        // 2 1 0 1 2
        // 3 2 1 0 1
        // 4 3 2 1 0

    }
}


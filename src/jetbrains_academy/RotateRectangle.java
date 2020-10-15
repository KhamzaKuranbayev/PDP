package jetbrains_academy;

import java.util.Scanner;

public class RotateRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        int[][] new_matrix = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int index = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                new_matrix[j][index] =  matrix[i][j];
            }
            index++;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(new_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

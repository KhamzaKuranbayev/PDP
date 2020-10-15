package jetbrains_academy;

import java.util.Scanner;

public class MaximumElementMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = arr[0][0];

        int row_max = 0;
        int column_max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row_max = i;
                    column_max = j;
                }
            }
        }

        System.out.println(row_max + " " + column_max);

    }
}

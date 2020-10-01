package matrix.fillMatrix;

import java.util.Scanner;

public class SecondWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            int fillNumber = index;
            for (int j = 0; j < matrix[i].length; j++) {

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

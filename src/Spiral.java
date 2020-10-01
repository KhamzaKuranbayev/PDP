import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        int k = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = k;
                k++;
            }
            System.out.println();
        }

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n * n - 1;

        while ((bottom >= top) && (right >= left)) {

            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }

            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }

            right--;
            for (int j = right; j >= left; j--) {
                System.out.print(matrix[bottom][j] + " ");
            }

            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][left] + " ");
            }

            left++;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}

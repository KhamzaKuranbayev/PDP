package jetbrains_academy;

import java.util.Scanner;

public class Cinema {
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
        int k = scanner.nextInt();
        boolean notFound = true;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 0 && k == 1) {
                    System.out.println(i+1);
                    notFound = false;
                    break;
                }
                if (arr[i][j] == 0 && k == m) {
                    count++;
                } else if (arr[i][j] == 0 && m - j >= k) {
                    int a = j;
                    for (int l = 0; l < k; l++) {
                        if (arr[i][a] == 0) {
                            count++;
                        }
                        a++;
                    }
                    if (count == k) {
                        System.out.println(i + 1);
                        notFound = false;
                        break;
                    } else {
                        count = 0;
                    }
                }
            }
            if (k == m && count == m) {
                System.out.println(i + 1);
                notFound = false;
                break;
            }
            if (!notFound)
                break;
        }

        if (notFound)
            System.out.println(0);

    }
}



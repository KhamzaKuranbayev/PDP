package jetbrains_academy.others;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    // Complete the beautifulDays function below.
//    static int beautifulDays(int i, int j, int k) {
//
//        int count = 0;
//        for(int a = i; a <= j; a++){
//            int difference = Math.abs(i - reverseNumber(i));
//            if(difference % k == 0) {
//                count ++;
//            }
//        }
//        return count;
//    }
//
//    private static int reverseNumber(int num) {
//        int reversed = 0;
//
//        for(;num != 0; num /= 10) {
//            int digit = num % 10;
//            reversed = reversed * 10 + digit;
//        }
//
//        return reversed;
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] ijk = scanner.nextLine().split(" ");
//
//        int i = Integer.parseInt(ijk[0]);
//
//        int j = Integer.parseInt(ijk[1]);
//
//        int k = Integer.parseInt(ijk[2]);
//
//        int result = beautifulDays(i, j, k);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }



    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {

        BigInteger f = new BigInteger("1");

        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        System.out.println(f);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}

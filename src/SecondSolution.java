import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecondSolution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

        int count = 0;
        for(int a = i; a <= j; a++) {
            int diff = Math.abs(a - reverse(a));

            if(diff % k == 0) {
                count ++;
            }
        }

        return count;
    }

    public static int reverse(int number) {
        int reversed = 0;

        for(;number != 0; number /= 10){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        int result = beautifulDays(i, j, k);
        System.out.println(result);
    }
}

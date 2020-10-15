package pdp_lessons.module1.lesson7;

public class Task14 {
    public static void main(String[] args) {
        int n = 2;
        while (n <= 100) {
            if(isPrime(n))
                System.out.print(n + " ");
            n++;
        }
    }
    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }
        return count == 2;
    }
}

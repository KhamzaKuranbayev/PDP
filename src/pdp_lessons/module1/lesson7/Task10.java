package pdp_lessons.module1.lesson7;

public class Task10 {
    public static void main(String[] args) {
        for (int i = 100; i <= 500; i++) {
            if (checkNumber(i))
                System.out.print(i + " ");
        }
    }

    public static boolean checkNumber(int number) {
        int a = number % 10;
        number = number / 10;

        int b = number % 10;
        number = number / 10;

        int c = number % 10;

        return a + b + c == 15;
    }
}

package pdp_lessons.module1.lesson7;

public class Task13 {
    public static void main(String[] args) {
        for (int i = 30; i <= 100; i++) {
            if(checkNumber(i))
                System.out.print(i + " ");
        }
    }

    public static boolean checkNumber(int number) {
        int lastDigit = number % 10;
        return number % 3 == 0 && (lastDigit == 2 || lastDigit == 4 || lastDigit == 8);
    }
}

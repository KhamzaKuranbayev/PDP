package pdp_lessons.module1.lesson7;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (!isRepeat(i)) System.out.print(i + " ");
        }
    }

    public static boolean isRepeat(int number) {
        String num = number + "";
        return num.charAt(0) == num.charAt(1) || num.charAt(0) == num.charAt(2) || num.charAt(1) == num.charAt(2);
    }
}

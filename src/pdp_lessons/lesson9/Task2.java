package pdp_lessons.lesson9;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(getDiff(1000000000, 9000000000.999f));
    }

    public static float getDiff(long num1, float num2) {
        return (float) num1 - num2;
    }
}

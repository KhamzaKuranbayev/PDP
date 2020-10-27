package pdp_lessons.module2.lesson9.task2;

public class Main {
    public static void main(String[] args) {
        MaxInterface maxInterface = (a, b) -> Math.max(a, b);
        System.out.println(maxInterface.max(10, 20));
    }
}

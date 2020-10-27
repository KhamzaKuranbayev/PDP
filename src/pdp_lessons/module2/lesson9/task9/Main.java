package pdp_lessons.module2.lesson9.task9;

public class Main {
    public static void main(String[] args) {

        Expression<String> expression = (s1, s2) -> s1.contains(s2);

        System.out.println(expression.hasContain("Hello world!", "worlds"));

    }
}

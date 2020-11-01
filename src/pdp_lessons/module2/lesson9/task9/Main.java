package pdp_lessons.module2.lesson9.task9;

public class Main {
    public static void main(String[] args) {

        Expression<String> expression = String::contains;

        System.out.println(expression.hasContain("Hello world!", "world"));

    }
}

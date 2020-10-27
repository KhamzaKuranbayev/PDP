package pdp_lessons.module2.lesson9.task1;

public class Main {
    public static void main(String[] args) {
        SignNumberInterface signNumberInterface = (number) -> {
            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("No positive");
            }
        };
        signNumberInterface.determineSign(-15);
        signNumberInterface.determineSign(15);
        signNumberInterface.determineSign(0);
    }
}

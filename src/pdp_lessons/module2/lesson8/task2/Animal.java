package pdp_lessons.module2.lesson8.task2;

public interface Animal {

    void sound();

    default void eat() {
        System.out.println("All animal can eat");
    }

    static void run() {
        System.out.println("All anima can run");
    }
}

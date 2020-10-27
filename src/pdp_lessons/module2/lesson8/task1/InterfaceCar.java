package pdp_lessons.module2.lesson8.task1;

public interface InterfaceCar {

    void start();

    void run();

    void stop();

    default boolean fly() {
        return false;
    }

}

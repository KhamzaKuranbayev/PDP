package pdp_lessons.module2.lesson9.task6;

@FunctionalInterface
public interface Expression<T> {

    boolean isEqual(T num);
}

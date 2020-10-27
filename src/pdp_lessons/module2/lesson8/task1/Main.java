package pdp_lessons.module2.lesson8.task1;

public class Main {
    public static void main(String[] args) {
        LegacyCar legacyCar = new LegacyCar("Legacy car", 2010);
        System.out.println(legacyCar.getName() + " | " + legacyCar.getYear() + " | can fly? " + legacyCar.fly());

        FutureCar futureCar = new FutureCar("Future car", 2050);
        System.out.println(futureCar.getName() + " | " + futureCar.getYear() + " | can fly? " + futureCar.fly());

    }
}

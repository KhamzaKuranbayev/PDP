package pdp_lessons.module2.lesson8.task4;

public class Main {
    public static void main(String[] args) {

        // Class orqali
        Person person = new Person();
        person.speak("Adham", "Hammaga salom");

        // Anonymous Class orqali
        Square square = new Square() {
            @Override
            public double calculate(double x) {
                return x * x;
            }
        };
        System.out.println(square.calculate(5));

        // Lambda expression orqali
        ArithmeticAverage average = new ArithmeticAverage() {
            @Override
            public double average(double a, double b, double c) {
                return (a + b + c) / 3;
            }
        };
        System.out.println(average.average(1, 2, 3));

        // Lambda expression orqali
        Half half = new Half() {
            @Override
            public int half(int number) {
                return number / 2;
            }
        };
        System.out.println(half.half(100));

        // Lambda expression orqali
        BeginLetter beginLetter = new BeginLetter() {
            @Override
            public String firstLetter(String text) {
                return text.substring(0, 1);
            }
        };
        System.out.println(beginLetter.firstLetter("Salom Dunyo"));

    }
}

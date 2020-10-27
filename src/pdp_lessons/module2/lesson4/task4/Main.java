package pdp_lessons.module2.lesson4.task4;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(4, "black", true, "Masha");
        Dog dog = new Dog(4, "white", true, "Sharik");
        Cow cow = new Cow(4, "brown", true, "Emma");

        Straus straus = new Straus(2, "black", true, 200, false);
        Bat bat = new Bat(2, "brown", true, 15, true);
        Eagle eagle = new Eagle(2, "black", false, 25, true);

        System.out.println(cat.toString());
        System.out.println(dog.toString());
        System.out.println(cow.toString());
        cat.sound();
        dog.sound();
        cow.sound();

        System.out.println(straus.toString());
        System.out.println(bat.toString());
        System.out.println(eagle.toString());

    }
}

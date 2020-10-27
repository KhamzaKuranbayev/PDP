package pdp_lessons.module2.lesson6.task2;

public class Cat extends Animal {

    public Cat(String color, String name) {
        super(color, name);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

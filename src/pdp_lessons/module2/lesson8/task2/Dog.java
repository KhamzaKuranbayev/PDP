package pdp_lessons.module2.lesson8.task2;

public class Dog implements Animal {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(getName() + " voiced!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ate the bone");
    }

    public static void run() {
        System.out.println("The dog run");
    }

    public boolean guard() {
        return true;
    }

}

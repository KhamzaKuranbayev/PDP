package pdp_lessons.module2.lesson7.task4;

public class Person implements Employee {

    String name;
    String address;
    String hairColor;
    String eyeColor;

    public void setName(String name) {
        this.name = name;
    }

    public void newAddress(String address) {
        this.address = address;
    }

    @Override
    public void hire() {

    }

    @Override
    public void fire() {

    }
}

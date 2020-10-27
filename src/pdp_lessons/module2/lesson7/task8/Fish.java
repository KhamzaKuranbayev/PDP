package pdp_lessons.module2.lesson7.task8;

public class Fish extends Animal implements Pet {

    String name;

    public Fish() {
        super(0);
    }

    @Override
    void walk() {

    }

    @Override
    void eat() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {

    }
}

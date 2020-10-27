package pdp_lessons.module2.lesson7.task8;

public abstract class Animal {

    int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    void walk() {
    }

    abstract void eat();
}

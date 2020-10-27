package pdp_lessons.module2.lesson4.task4;

public class Animal {

    private int count_legs;
    private String color;
    private boolean mammal; // true - sut emizuvchi false - sut emizuvchi emas

    public Animal(int count_legs, String color, boolean mammal) {
        this.count_legs = count_legs;
        this.color = color;
        this.mammal = mammal;
    }

    public int getCount_legs() {
        return count_legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isMammal() {
        if (mammal)
            return "Mammal";
        return "Not mammal";
    }

    public void sound() {
    }

}

package pdp_lessons.module2.lesson4.task4;

public class Bird extends Animal {

    private int length_wing; // qanoti uzunligi
    private boolean flying; // true - uchadi false - ucha olmaydi

    public Bird(int count_legs, String color, boolean isMammal, int length_wing, boolean flying) {
        super(count_legs, color, isMammal);
        this.length_wing = length_wing;
        this.flying = flying;
    }

    public int getLength_wing() {
        return length_wing;
    }

    public String isFlying() {
        if (flying)
            return "Flying";
        return "Not Flying";
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }
}

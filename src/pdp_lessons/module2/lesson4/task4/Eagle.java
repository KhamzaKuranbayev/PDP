package pdp_lessons.module2.lesson4.task4;

public class Eagle extends Bird {

    public Eagle(int count_legs, String color, boolean isMammal, int length_wing, boolean flying) {
        super(count_legs, color, isMammal, length_wing, flying);
    }

    @Override
    public String toString() {
        return "Eagle [ Legs: " + getCount_legs() + ", Color: " + getColor() + ", "
                + isMammal() + ", Length wing(sm): " + getLength_wing() + ", " + isFlying();
    }
}

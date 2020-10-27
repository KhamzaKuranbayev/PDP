package pdp_lessons.module2.lesson4.task4;

public class Cow extends Pet {

    public Cow(int count_legs, String color, boolean isMammal, String nickname) {
        super(count_legs, color, isMammal, nickname);
    }

    @Override
    public void sound() {
        System.out.println("Cow sound moo");
    }

    @Override
    public String toString() {
        return "Cow [ Legs: " + getCount_legs() + ", Color: " + getColor() + ", "
                + isMammal() + ", Nickname: " + getNickname() + " ]";
    }

}

package pdp_lessons.module2.lesson4.task4;

public class Dog extends Pet {

    public Dog(int count_legs, String color, boolean isMammal, String nickname) {
        super(count_legs, color, isMammal, nickname);
    }

    @Override
    public void sound() {
        System.out.println("Dog sound voof");
    }

    @Override
    public String toString() {
        return "Dog [ Legs: " + getCount_legs() + ", Color: " + getColor() + ", "
                + isMammal() + ", Nickname: " + getNickname() + " ]";
    }
}

package pdp_lessons.module2.lesson4.task4;

public class Cat extends Pet {

    public Cat(int count_legs, String color, boolean isMammal, String nickname) {
        super(count_legs, color, isMammal, nickname);
    }

    @Override
    public void sound() {
        System.out.println("Cat sound meow");
    }

    @Override
    public String toString() {
        return "Cat [ Legs: " + getCount_legs() + ", Color: " + getColor() + ", "
                + isMammal() + ", Nickname: " + getNickname() + " ]";
    }
}

package pdp_lessons.module2.lesson4.task4;

public class Pet extends Animal {

    private String nickname; // laqabi

    public Pet(int count_legs, String color, boolean isMammal, String nickname) {
        super(count_legs, color, isMammal);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}

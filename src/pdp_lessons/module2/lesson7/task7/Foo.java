package pdp_lessons.module2.lesson7.task7;

public class Foo extends Bar implements Fizz {

    String drink_type;

    public Foo(String name, String address, int seat, String drink_type) {
        super(name, address, seat);
        this.drink_type = drink_type;
    }

    public String getDrink_type() {
        return drink_type;
    }

    public void setDrink_type(String drink_type) {
        this.drink_type = drink_type;
    }

    @Override
    public boolean canFizz() {
        return false;
    }

}

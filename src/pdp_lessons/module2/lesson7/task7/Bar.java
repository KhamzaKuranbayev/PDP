package pdp_lessons.module2.lesson7.task7;

public class Bar {

    String name;
    String address;
    int seat;

    public Bar(String name, String address, int seat) {
        this.name = name;
        this.address = address;
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}

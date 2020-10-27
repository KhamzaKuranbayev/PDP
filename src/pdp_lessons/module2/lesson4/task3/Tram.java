package pdp_lessons.module2.lesson4.task3;

public class Tram extends Train {

    private int number;// Nomeri: 13, 19, 9, ..

    public Tram(String name, String production_year, int weight, int speed, String route_name, int passenger_seat, int number) {
        super(name, production_year, weight, speed, route_name, passenger_seat);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

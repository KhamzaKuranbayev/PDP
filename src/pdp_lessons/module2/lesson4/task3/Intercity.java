package pdp_lessons.module2.lesson4.task3;

public class Intercity extends Train {

    private String type; // High speed trains, Regional trains, ...
    private int count_wagons; // Vagonlar soni

    public Intercity(String name, String production_year, int weight, int speed,
                     String route_name, int passenger_seat, String type, int count_wagons) {
        super(name, production_year, weight, speed, route_name, passenger_seat);
        this.type = type;
        this.count_wagons = count_wagons;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount_wagons() {
        return count_wagons;
    }

    public void setCount_wagons(int count_wagons) {
        this.count_wagons = count_wagons;
    }
}

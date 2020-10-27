package pdp_lessons.module2.lesson4.task3;

public class Train extends Transport {

    private String route_name; // yo'nalish nomi
    private int passenger_seat; // yo'lovchilar uchun joy soni;


    public Train(String name, String production_year, int weight, int speed, String route_name, int passenger_seat) {
        super(name, production_year, weight, speed);
        this.route_name = route_name;
        this.passenger_seat = passenger_seat;
    }

    public String getRoute_name() {
        return route_name;
    }

    public void setRoute_name(String route_name) {
        this.route_name = route_name;
    }

    public int getPassenger_seat() {
        return passenger_seat;
    }

    public void setPassenger_seat(int passenger_seat) {
        this.passenger_seat = passenger_seat;
    }
}

package pdp_lessons.module2.lesson4.task3;

public class Truck extends Vehicle {

    private String type;// Tanker Truck, Semi-Trailer Truck, Heavy Truck ...;
    private int cargo_container_width; // Yuk konteyneri eni
    private int cargo_container_length; // Yuk konteyneri bo'yi
    private int cargo_container_height; // Yuk konteyneri balandigi


    public Truck(String name, String production_year, int weight, int speed, String engine_type, String model,
                 String color, int price, String type, int cargo_container_width,
                 int cargo_container_length, int cargo_container_height) {
        super(name, production_year, weight, speed, engine_type, model, color, price);
        this.type = type;
        this.cargo_container_width = cargo_container_width;
        this.cargo_container_length = cargo_container_length;
        this.cargo_container_height = cargo_container_height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCargo_container_width() {
        return cargo_container_width;
    }

    public void setCargo_container_width(int cargo_container_width) {
        this.cargo_container_width = cargo_container_width;
    }

    public int getCargo_container_length() {
        return cargo_container_length;
    }

    public void setCargo_container_length(int cargo_container_length) {
        this.cargo_container_length = cargo_container_length;
    }

    public int getCargo_container_height() {
        return cargo_container_height;
    }

    public void setCargo_container_height(int cargo_container_height) {
        this.cargo_container_height = cargo_container_height;
    }
}

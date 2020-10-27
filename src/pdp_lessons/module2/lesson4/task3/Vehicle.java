package pdp_lessons.module2.lesson4.task3;

public class Vehicle extends Transport {

    private String engine_type;
    private String model;
    private String color;
    private int price;

    public Vehicle(String name, String production_year, int weight, int speed, String engine_type, String model, String color, int price) {
        super(name, production_year, weight, speed);
        this.engine_type = engine_type;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

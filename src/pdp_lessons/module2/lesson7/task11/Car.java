package pdp_lessons.module2.lesson7.task11;

public abstract class Car extends WheeledVehicle {

    String model;
    String color;
    String year;

    public Car(String type, int numberOfWheels, String model, String color, String year) {
        super(type, numberOfWheels);
        this.model = model;
        this.color = color;
        this.year = year;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

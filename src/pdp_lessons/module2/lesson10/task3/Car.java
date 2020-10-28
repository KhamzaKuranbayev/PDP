package pdp_lessons.module2.lesson10.task3;

public class Car{

    private String color;
    private String model;
    private String stateNumber;

    public Car(String color, String model, String stateNumber) {
        this.color = color;
        this.model = model;
        this.stateNumber = stateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", stateNumber='" + stateNumber + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Car o) {
//        return this.getModel().compareToIgnoreCase(o.getModel());
//    }
}

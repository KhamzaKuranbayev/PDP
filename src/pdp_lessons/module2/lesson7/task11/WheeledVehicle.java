package pdp_lessons.module2.lesson7.task11;

public abstract class WheeledVehicle extends Vehicle {

    int numberOfWheels;

    public WheeledVehicle(String type, int numberOfWheels) {
        super(type);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}

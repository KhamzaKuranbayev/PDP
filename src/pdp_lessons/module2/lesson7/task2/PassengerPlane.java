package pdp_lessons.module2.lesson7.task2;

public class PassengerPlane extends Aircraft {

    int passengers;

    public PassengerPlane(int passengers) {
        this.passengers = passengers;
    }

    @Override
    void start() {

    }

    @Override
    void stop() {

    }

    @Override
    void takeOff() {

    }

    @Override
    void land() {

    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

package pdp_lessons.module2.lesson7.task11;

public class SedanCar extends Car {

    double volume_luggage_space; // yuk joyi hajmi

    public SedanCar(String type, int numberOfWheels, String model, String color,
                    String year, double volume_luggage_space) {
        super(type, numberOfWheels, model, color, year);
        this.volume_luggage_space = volume_luggage_space;
    }

    public double getVolume_luggage_space() {
        return volume_luggage_space;
    }

    public void setVolume_luggage_space(double volume_luggage_space) {
        this.volume_luggage_space = volume_luggage_space;
    }

    @Override
    void start() {

    }

    @Override
    void run() {

    }

    @Override
    void stop() {

    }
}

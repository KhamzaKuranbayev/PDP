package pdp_lessons.module2.lesson8.task1;

public class FutureCar implements InterfaceCar {

    String name;
    int year;

    public FutureCar(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void start() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean fly() {
        return true;
    }
}

package pdp_lessons.module2.lesson7.task11;

public abstract class Vehicle {

    String type; // quruqlikda, suvda, havoda, ...

    public Vehicle(String type) {
        this.type = type;
    }

    abstract void start();

    abstract void run();

    abstract void stop();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

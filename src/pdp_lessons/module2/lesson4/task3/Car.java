package pdp_lessons.module2.lesson4.task3;

public class Car extends Vehicle {

    private String car_owner;
    private boolean alarm_system; // Magicar bormi? true - bor false - yo'q

    public Car(String name, String production_year, int weight, int speed, String engine_type,
               String model, String color, int price, String car_owner, boolean alarm_system) {
        super(name, production_year, weight, speed, engine_type, model, color, price);
        this.car_owner = car_owner;
        this.alarm_system = alarm_system;
    }

    public String getCar_owner() {
        return car_owner;
    }

    public void setCar_owner(String car_owner) {
        this.car_owner = car_owner;
    }

    public boolean isAlarm_system() {
        return alarm_system;
    }

    public void setAlarm_system(boolean alarm_system) {
        this.alarm_system = alarm_system;
    }
}

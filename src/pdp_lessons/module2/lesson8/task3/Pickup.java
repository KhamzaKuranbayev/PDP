package pdp_lessons.module2.lesson8.task3;

public class Pickup implements CargoAuto, PassengerAuto {

    static void transportCargo() {
        System.out.println("Pickup is CargoAuto");
    }

    @Override
    public void passengersAuto() {
        System.out.println("Pickup is PassengerAuto");
    }
}

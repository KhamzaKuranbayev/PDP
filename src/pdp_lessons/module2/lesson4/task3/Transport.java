package pdp_lessons.module2.lesson4.task3;

public class Transport {

    private String name;
    private String production_year;
    private int weight;
    private int speed;

    public Transport(String name, String production_year, int weight, int speed) {
        this.name = name;
        this.production_year = production_year;
        this.weight = weight;
        this.speed = speed;
    }

    public void drive() {
        System.out.println("Driving a transport");
    }

    public void start(){
        System.out.println("Transport is starting to move");
    }

    public void stop() {
        System.out.println("Transport is stopping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction_year() {
        return production_year;
    }

    public void setProduction_year(String production_year) {
        this.production_year = production_year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

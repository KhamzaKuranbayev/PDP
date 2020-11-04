package pdp_lessons.module3.lesson3.task11;

public enum TrafficLight {

    RED("STOP"),
    YELLOW("WAIT"),
    GREEN("GO");

    private String action;

    TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}

package pdp_lessons.module3.lesson4.task2;

public enum CardType {

    UZCARD("USZ"),
    HUMO("USZ"),
    VISA("USD"),
    UNIONPAY("USD");

    private String unit;

    CardType(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

}

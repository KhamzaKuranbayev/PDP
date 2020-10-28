package jetbrains_academy.others;

public class EnumExample {
    public static void main(String[] args) {
        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;

        System.out.println(high.getLevel() > medium.getLevel()); // true
    }
}

enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    DangerLevel(int number) {
        this.number = number;
    }

    private final int number;

    public int getLevel() {
        return number;
    }

}

enum Month {
    JAN(1),
    FEB(2),
    MAR(3),
    APR(4),
    MAY(5),
    JUN(6),
    JUL(7),
    AUG(8),
    SEP(9),
    OCT(10),
    NOV(11),
    DEC(12);

    Month(int number) {
        this.number = number;
    }

    private final int number;

    public int getNumber() {
        return number;
    }
}

enum Currency {
    USD("United States dollar"),
    EUR("Euro"),
    GBP("Pound sterling"),
    RUB("Russian ruble"),
    UAH("Ukrainian hryvnia"),
    KZT("Kazakhstani tenge"),
    CAD("Canadian dollar"),
    JPY("Japanese yen"),
    CNY("Chinese yuan");

    Currency(String name) {
    }
}

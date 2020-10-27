package pdp_lessons.module2.lesson5.task3;

public class Calculator {

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public double add(double a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // 2. sub
    public int sub(int a, int b) {
        return a - b;
    }

    public double sub(int a, double b) {
        return a - b;
    }

    public static double sub(double a, int b) {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    // 3.multiply
    public int multiply(int a, int b) {
        return a - b;
    }

    public double multiply(int a, double b) {
        return a * b;
    }

    public static double multiply(double a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // 4.div
    public double div(int a, int b) {
        return (double) a / b;
    }

    public static double div(int a, double b) {
        return a / b;
    }

    public double div(double a, int b) {
        return a / b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    // 5.abs
    public int abs(int a, int b) {
        return ((a - b) < 0) ? -(a - b) : (a - b);
    }

    public static double abs(int a, double b) {
        return ((a - b) < 0) ? -(a - b) : (a - b);
    }

    public static double abs(double a, int b) {
        return ((a - b) < 0) ? -(a - b) : (a - b);
    }

    public double abs(double a, double b) {
        return ((a - b) < 0) ? -(a - b) : (a - b);
    }

    // 6.pow
    public static int pow(int a, int b) {
        int pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }

    public double pow(double a, int b) {
        double pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }

}

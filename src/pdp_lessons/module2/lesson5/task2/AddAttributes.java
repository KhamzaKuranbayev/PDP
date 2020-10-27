package pdp_lessons.module2.lesson5.task2;

public class AddAttributes {

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(int a, double b) {
        return a + b;
    }

    public double sum(double a, double b, double c) {
        return a + b + c;
    }

    public String sum(String text1, String text2) {
        return text1.concat(" ").concat(text2);
    }

    public String sum(int number, String text2) {
        return String.valueOf(number).concat(" ").concat(text2);
    }


}

package pdp_lessons.lesson9;

public class Task4 {
    public static void main(String[] args) {
        byte b = 2;
        char c = 'W';
        short s = 3;
        int i = 4;
        float f = 5.6789f;

        System.out.println(getMultiple(b, c, s, i, f));
    }

    public static double getMultiple(byte b, char c, short sh, int i, float f) {
        int first = c * b * sh;
        return first * i * f;
    }
}

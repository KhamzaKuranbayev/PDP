package pdp_lessons.lesson9;

public class Task3 {
    public static void main(String[] args) {
        double d = 2007956782.2157;

        long l = (long) d;
        int i = (int) d;
        short sh = (short) d;
        char c = (char) d;
        byte b = (byte) d;
        float f = (float) d;

        System.out.println("long value: " + l + "\nint value: " + i + "\nshort value: " +
                sh + "\nchar value: " + c + "\nbyte value: " + b + "\nfloat value: " + f);
    }
}

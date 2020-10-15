package pdp_lessons.module1.lesson2;

public class ChangePlace {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " , " + b);
    }
}



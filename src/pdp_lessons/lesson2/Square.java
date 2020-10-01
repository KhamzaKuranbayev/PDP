package pdp_lessons.lesson2;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();

        int perimetr = 4 * side;
        int area = side * side;

        System.out.println("Kvadrat perimetri P = " + perimetr + ", yuzasi S = " + area);
    }
}

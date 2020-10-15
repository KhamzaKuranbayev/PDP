package pdp_lessons.module1.lesson3;

import java.util.Scanner;

public class AllOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Basic Arithmetic Operators
        System.out.println("Basic Arithmetic Operators");
        System.out.println(a + " + " + b + " = " + (a + b) + ",");
        System.out.println(a + " - " + b + " = " + (a - b) + ",");
        System.out.println(a + " * " + b + " = " + (a * b) + ",");
        System.out.println(a + " / " + b + " = " + (a / b) + ",");
        System.out.println(a + " % " + b + " = " + (a % b) + "\n");

        // Logical Operators
        System.out.println("Logical Operators");
        System.out.println(a + " > 0 && " + b + " > 0 : " + (a > 0 && b > 0));
        System.out.println(a + " == 0 || " + b + " < 0 : " + (a == 0 || b < 0));
        System.out.println("!(" + a + " == 0 || " + b + " < 0 ): " + !(a == 0 || b < 0) + "\n");

        // Comparison(Relational) operators
        System.out.println("Comparison(Relational) operators");
        System.out.println(a + " == " + b + " : " + (a == b) + ",");
        System.out.println(a + " != " + b + " : " + (a != b) + ",");
        System.out.println(a + " > " + b + " : " + (a > b) + ",");
        System.out.println(a + " < " + b + " : " + (a < b) + ",");
        System.out.println(a + " >= " + b + " : " + (a >= b) + "\n");

        // Bitwise Operators
        System.out.println("Bitwise Operators");
        System.out.println(a + " & " + b + " : " + (a & b) + ",");
        System.out.println(a + " |  " + b + " =>: " + (a | b) + ",");
        System.out.println("~" + a + " : " + (~a) + ",");
        System.out.println("~" + b + " : " + (~b) + ",");
        System.out.println(a + " <<2 " + (a << 2) + ",");
        System.out.println(b + " <<2 " + (b << 2) + ",");
        System.out.println(a + " >>2 " + (a >> 2) + ",");
        System.out.println(b + " >>2 " + (b >> 2) + ",");

    }
}

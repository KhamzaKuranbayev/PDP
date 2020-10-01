package pdp_lessons.codingbat;

import java.util.Scanner;

public class NearTen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(sortaSum(num1, num2));
    }

    public static boolean nearTen(int num) {
        int a = num % 10;

        if (a >= 8) {
            a = 10 - a;
        }

        if (a >= 0 && a <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean love6(int a, int b) {

        boolean b1 = (a == 6 || b == 6);
        boolean b2 = (Math.abs(a - b) == 6) || (a + b == 6);

        return b1 || b2;
    }

    public static boolean more20(int n) {
        int a = n % 20;

        if (a == 1 && a == 2) {
            return true;
        } else {
            return false;
        }
    }

    public int teaParty(int tea, int candy) {
        if (tea >= 5 && candy >= 5) {
            if (tea / candy >= 2 || candy / tea >= 2) {
                return 2;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static boolean twoAsOne(int a, int b, int c) {
        boolean b1 = (a + b) == c;
        boolean b2 = (a + c) == b;
        boolean b3 = (b + c) == a;

        return b1 || b2 || b3;
    }

    public static boolean lastDigit(int a, int b, int c) {
        int num1 = a % 10;
        int num2 = b % 10;
        int num3 = c % 10;

        int count = 1;
        if (num1 == num2) {
            count++;
        }
        if (num1 == num3) {
            count++;
        }
        if (num2 == num3) {
            count++;
        }

        return count >= 2;
    }

    public static boolean shareDigit(int a, int b) {

        int num1 = a % 10;
        int num2 = a / 10;

        int num3 = b % 10;
        int num4 = b / 10;

        if (num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4) {
            return true;
        } else {
            return false;
        }

    }

    public static String fizzString(String str) {
        boolean f = str.startsWith("f");
        boolean b = str.endsWith("b");

        if (f && b) return "FizzBuzz";
        if (f) return "Fizz";
        if (b) return "Buzz";
        return str;
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        boolean b1 = b > a && c > b;
        boolean b2 = bOk && c > b;
        return b1 || b2;
    }

    public static boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 ||
                Math.abs(b - c) >= 10 ||
                Math.abs(a - c) >= 10);
    }

    public static int redTicket(int a, int b, int c) {
        boolean b1 = a == b && b == c;
        boolean b2 = a != b && a != c;

        if (b1 && a == 2) {
            return 10;
        } else if (b1) {
            return 5;
        } else if (b2) {
            return 1;
        }
        return 0;
    }

    public static int maxMod5(int a, int b) {
        int mod1 = a % 5;
        int mod2 = b % 5;

        boolean b1 = mod1 == mod2;

        if (b1) {
            if (a == b) return 0;
            return Math.min(a, b);
        } else {
            return Math.max(a, b);
        }
    }

    public static int blueTicket(int a, int b, int c) {
        boolean b1 = (a + b) == 10 || (a + c) == 10 || (b + c) == 10;
        boolean b2 = (a + b) - (a + c) == 10 || (a + b) - (b + c) == 10;

        if (b1) return 10;
        if (b2) return 5;
        return 0;
    }

    public static int dateFashion(int you, int date) {
        boolean b1 = you >= 8 || date >= 8;
        boolean b2 = you <= 2 || date <= 2;

        if (b2) {
            return 0;
        } else if (b1) {
            return 2;
        }
        return 1;
    }

    public static int sortaSum(int a, int b) {
        boolean b1 = a + b >= 10 && a + b <= 19;

        if(b1) return 20;
        return a + b;
    }

//    public boolean in1To10(int n, boolean outsideMode) {
//        boolean b = n >= 1 && n <= 10;
//
//        if(b) return true;
//
//
//    }
}

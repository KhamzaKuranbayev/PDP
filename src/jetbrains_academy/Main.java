package jetbrains_academy;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        //        jetbrains_academy.DerivedClass derivedClass = new jetbrains_academy.DerivedClass();
//        System.out.println(derivedClass.sum());

//        int number = 12241;
//        System.out.println(((number % 100) / 10) % 10);

//        int n = 0;
//        //System.out.print(++n);
//        System.out.print(n++);
//        //System.out.print(n++);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write how many cups of coffee you will need:");
//        String s1 = scanner.nextLine();
//        System.out.println("For " + s1 +" cups of coffee you will need:");
//        System.out.println( (Integer.parseInt(s1) * 200) + " ml of water");
//        System.out.println( (Integer.parseInt(s1) * 50) + " ml of milk");
//        System.out.println( (Integer.parseInt(s1) * 15) + " ml of coffee beans");

//        int number = 990;
//        boolean result = number > 1000 || number % 10 == 0;
//        System.out.println(result);

//        boolean result_john = John(true, 1, false, 0 );
//
//        boolean result_Mary = Mary(false, 0, true, 3 );
//
//        boolean result_Olivia = Olivia(true, 0, true, 2 );
//
//        boolean result_Alexander = Alexander(true, 3, true, 2 );
//
//        boolean result_Andrew = Andrew(false, 1, false, 1 );
//
//        boolean result_Emily = Emily(false, 0, true, 2 );
//
//        System.out.println(result_john); //  OK
//
//        System.out.println(result_Mary); // OK
//
//        System.out.println(result_Olivia);
//
//        System.out.println(result_Alexander); // OK
//
//        System.out.println(result_Andrew);
//
//        System.out.println(result_Emily);

//        Scanner scanner = new Scanner(System.in);
//        int str = Integer.parseInt(scanner.nextLine());
//        if (str < 10) {
//            System.out.print(true);
//        } else {
//            System.out.print(false);
//        }
//        Scanner scanner = new Scanner(System.in);
//
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        int n3 = scanner.nextInt();

//        boolean onlyFirstIsPositive = n1 > 0 && n2 <= 0 && n3 <= 0;
//        boolean onlySecondIsPositive = n1 <= 0 && n2 > 0 && n3 <= 0;
//        boolean onlyThirdIsPositive = n1 <= 0 && n2 <= 0 && n3 > 0;
//
//        boolean exactlyOneIsPositive =
//                onlyFirstIsPositive ||
//                        onlySecondIsPositive ||
//                        onlyThirdIsPositive;

//        boolean result = ((n1 + n2) == 20) || ((n1 + n3) == 20) || ((n2 + n3) == 20);
//
//        System.out.println(result);
         /* Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int num1 = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int num2 = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int num3 = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int num4 = scanner.nextInt();

        boolean check = (num1 >= 200) && (num2 >= 50) && (num3 >= 15);
        if (check || (num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0)) {

            int water = num1 / 200;
            int milk = num2 / 50;
            int coffee = num3 / 15;

            int min = 0;
            if (water <= coffee && water <= milk) {
                min = water;
            } else if (milk <= water && milk <= coffee) {
                min = milk;
            } else {
                min = coffee;
            }

            if (min >= num4) {
                if (min > 1) {
                    System.out.println("Yes, I can make that amount of coffee (and even " + (min-1) + " more than that)");
                } else if (num4 == 0 && (num1 != 0 && num2 != 0 && num3 != 0)) {
                    System.out.println("Yes, I can make that amount of coffee (and even 1 more than that)");
                } else {
                    System.out.println("Yes, I can make that amount of coffee");
                }
            } else {
                System.out.println("No, I can make only " + min + " cup(s) of coffee");
            }
        } else {
            System.out.println("No, I can make only 0 cup(s) of coffee");
        }
        */
        //Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        FizzBuzz(num1, num2);

//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int[] strArray = new int[30000];
//
//        for(int i = 0; i < size; i++) {
//            strArray[i] = scanner.nextInt();
//        }
//
//        int max = 0;
//        for (int i : strArray) {
//            if (i % 4 == 0) {
//                if (i > max) {
//                    max = i;
//                }
//            }
//        }
//        System.out.println(max);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        long result = 1;
//        if (num1 < num2) {
//            for (int i = num1; i < num2; i++) {
//                result *= i;
//            }
//            System.out.println(result);
//        }

//        int counter = 0;
//        boolean shouldBeStopped = false;
//
//        while (!shouldBeStopped) {
//            if (counter == 3) {
//                shouldBeStopped = true;
//            }
//            counter++;
//        }

//        int i = 0;
//        while (i < 10) {
//            i++;
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        int num;
//        int max = 0;
//        do {
//            num = scanner.nextInt();
//            if (num > max) max = num;
//        } while (num != 0);

//        long number = scanner.nextLong();
//        long fact = 1;
//        int count =1;
//        while (fact <= number) {
//            count ++;
//            fact *=count;
//        }
//        System.out.println(count);

//        int num;
//        do {
//            num = scanner.nextInt();
//            if(num == 0) {
//                continue;
//            }
//            if(num % 2 == 0) System.out.println("even");
//            if(num % 2 != 0) System.out.println("odd");
//        } while (num != 0);

//        Scanner scanner = new Scanner(System.in);
//        int heightOfBus = scanner.nextInt();
//        int numberOfBridges = scanner.nextInt();
//        int[] strArray = new int[numberOfBridges];
//
//        for (int i = 0; i < numberOfBridges; i++) {
//            strArray[i] = scanner.nextInt();
//        }
//
//        busTour(heightOfBus, strArray);

//        Scanner in = new Scanner(System.in);
//        int lengthSeq = in.nextInt();
//        int[] sequence = new int[lengthSeq];
//
//        for(int i = 0; i < sequence.length; i++) {
//            sequence[i] = in.nextInt();
//        }
//
//        reverseArray(sequence);
//        for(int i = 0; i < sequence.length; i++) {
//            System.out.print(sequence[i] + " ");
//        }

//        Scanner sc = new Scanner(System.in);
//        int currentNumber = sc.nextInt();
//        boolean ascending = false;
//        boolean descending = false;
//        boolean inOrder = true;
//        int value;
//
//        while (true) {
//            value = sc.nextInt();
//            if (value == currentNumber) {
//                continue;
//            } else if (value == 0) {
//                break;
//            } else {
//                if (!ascending && !descending) {
//                    if (value > currentNumber) {
//                        ascending = true;
//                    } else if (value < currentNumber) {
//                        descending = true;
//                    }
//                } else if (ascending && value < currentNumber || descending && value > currentNumber) {
//                    inOrder = false;
//                }
//                currentNumber = value;
//            }
//        }
//        System.out.println(inOrder);

//        int value;
//        int sum = 0;
//
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            value = scanner.nextInt();
//            sum += value;
//
//            if (value == 0) {
//                break;
//            } else {
//                if (sum >= 1000) {
//                    sum -= 1000;
//                    break;
//                }
//            }
//        }
//        System.out.println(sum);

//        Scanner scanner = new Scanner(System.in);
//        switch (scanner.nextInt()) {
//            case 1:
//                System.out.println("Yes!");
//                break;
//            case 2:
//            case 3:
//            case 4:
//                System.out.println("No!");
//                break;
//            default:
//                System.out.println("Unknown number");
//                break;
//        }

//        Scanner scanner = new Scanner(System.in);
//        double a, b, c, r;
//
//        switch (scanner.next()) {
//            case "triangle":
//                a = scanner.nextDouble();
//                b = scanner.nextDouble();
//                c = scanner.nextDouble();
//
//                System.out.println(areaTriangle(a, b, c));
//                break;
//
//            case "rectangle":
//                a = scanner.nextDouble();
//                b = scanner.nextDouble();
//
//                System.out.println(areaRectangle(a, b));
//                break;
//
//            case "circle":
//                r = scanner.nextDouble();
//
//                System.out.println(areaCircle(r));
//                break;
//        }

//        final Scanner scanner = new Scanner(System.in);
//        final double d = scanner.nextDouble();
//        System.out.println(extractInt(d));

//        final Scanner scanner = new Scanner(System.in);
//        final int n = scanner.nextInt();
//        final int m = scanner.nextInt();
//        System.out.println(power(n, m));

//        final Scanner scanner = new Scanner(System.in);
//
//        int from = scanner.nextInt();
//        int to = scanner.nextInt();
//
//        System.out.println(sumInRange(from, to));

//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        extraLongFactorials(num1);

        //System.out.println(getRandomNumberString());

        Complex number = new Complex();
        number.real = 10;
        number.image = 4;

        Complex anotherNumber = new Complex();
        anotherNumber.real = 6;
        anotherNumber.image = 6;

        number.add(anotherNumber);

    }

    public static String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }

    static void extraLongFactorials(int n) {
        BigInteger f = new BigInteger("1");

        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        System.out.println(f);
    }

    private static int reverseNumber(int num) {
        int reversed = 0;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    public static long sumInRange(int from, int to) {

        if (from == to) {
            return 0;
        }

        long sum = 0;
        for (int i = from; i < to; i++) {
            sum += i;
        }

        return sum;
    }

    public static long power(int n, int m) {
        return (long) Math.pow(n, m);
    }

    public static int extractInt(double d) {
        return (int) d;
    }

    public static void printSum(long val1, int val2) {
        System.out.println(val1 + val2);
    }

    public static double areaTriangle(double a, double b, double c) {
        double p = (a + b + c) * 0.5;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double areaRectangle(double a, double b) {
        return a * b;
    }

    public static double areaCircle(double r) {
        return 3.14 * r * r;
    }


    public static boolean isOrdered(int[] sequence) {
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] > sequence[i + 1]) {
                reverseArray(sequence);
                break;
            }
        }

        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] > sequence[i + 1] && sequence[sequence.length - 1] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void reverseArray(int[] validData) {
        List listOfProducts = Arrays.asList(validData);
        Collections.reverse(listOfProducts);
    }

    public static void busTour(int heightOfBus, int[] strArray) {
        boolean isCrash = false;
        int number = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] <= heightOfBus) {
                isCrash = true;
                number = i + 1;
                break;
            }
        }

        if (isCrash) {
            System.out.println("Will crash on bridge " + number);
        } else {
            System.out.println("Will not crash");
        }
    }


    public static void FizzBuzz(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {

            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }

        }
    }

    public static void test1() {
        for (; ; ) {
            System.out.println("hello");
        }
    }

    public static boolean John(boolean knowJava, int yearsOfExperienceInJava, boolean knowPython, int yearsOfExperienceInPython) {
        boolean offerAJob = (knowJava && yearsOfExperienceInJava >= 1) ||
                (knowPython && yearsOfExperienceInPython >= 3);

        return offerAJob;
    }

    public static boolean Mary(boolean knowJava, int yearsOfExperienceInJava, boolean knowPython, int yearsOfExperienceInPython) {
        boolean offerAJob = (knowJava && yearsOfExperienceInJava >= 1) ||
                (knowPython && yearsOfExperienceInPython >= 3);

        return offerAJob;
    }

    public static boolean Olivia(boolean knowJava, int yearsOfExperienceInJava, boolean knowPython, int yearsOfExperienceInPython) {
        boolean offerAJob = (knowJava && yearsOfExperienceInJava >= 1) ||
                (knowPython && yearsOfExperienceInPython >= 3);

        return offerAJob;
    }

    public static boolean Alexander(boolean knowJava, int yearsOfExperienceInJava, boolean knowPython, int yearsOfExperienceInPython) {
        boolean offerAJob = (knowJava && yearsOfExperienceInJava >= 1) ||
                (knowPython && yearsOfExperienceInPython >= 3);

        return offerAJob;
    }

    public static boolean Andrew(boolean knowJava, int yearsOfExperienceInJava, boolean knowPython, int yearsOfExperienceInPython) {
        boolean offerAJob = (knowJava && yearsOfExperienceInJava >= 1) ||
                (knowPython && yearsOfExperienceInPython >= 3);

        return offerAJob;
    }

    public static boolean Emily(boolean knowJava, int yearsOfExperienceInJava, boolean knowPython, int yearsOfExperienceInPython) {
        boolean offerAJob = (knowJava && yearsOfExperienceInJava >= 1) ||
                (knowPython && yearsOfExperienceInPython >= 3);

        return offerAJob;
    }

    public static void method(short s) {
        System.out.println("short");
    }

    public static void method(byte b) {
        System.out.println("byte");
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(long l) {
        System.out.println("long");
    }
}

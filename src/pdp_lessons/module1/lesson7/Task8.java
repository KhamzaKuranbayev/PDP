package pdp_lessons.module1.lesson7;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("===1) Kiruvchi parametrga 10 berilganda ===");
        method1(20);
        System.out.println("===2) Kiruvchi parametrga 4 berilganda ===");
        method2(9);
        System.out.println("===3) Kiruvchi parametrga 10 berilganda ===");
        method3(10);
        System.out.println("====4) Kiruvchi parametrga 4 berilganda ===");
        method4(4);
        System.out.println("===5) Kiruvchi parametrga 7 berilganda ===");
        method5(7);
    }

    public static void method1(int number) {
        int n = 1;
        String result = "";
        while (n <= number) {
            result += n;
            System.out.println(result);
            n++;
        }
    }

    public static void method2(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void method3(int number) {
//        int a = 1;
//        boolean finished = false;
//        for (int count = 1; count <= number; count++) {
//            for (int j = 0; j < count; j++) {
//                System.out.print(a + " ");
//                a++;
//                if (a == number) {
//                    System.out.println(a);
//                    finished = true;
//                    break;
//                }
//            }
//            if (finished)
//                break;
//            System.out.println();
//        }

        int count = 0;
        for(int i = 1; i<= 10; i++) {
            for(int j = 0; j < i; j++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }

    }

    public static void method4(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }

    public static void method5(int number) {
        int a = 2 * number - 1;
        int b = number;
        for (int i = 1; i <= a; i++) {
            if (i <= number) {
                for (int j = number - i; j > 0; j--) {
                    System.out.print("   ");
                }
                for (int k = i; k > 0; k--) {
                    System.out.print(k);
                }
                for (int l = 2; l < i + 1; l++) {
                    System.out.print(l);
                }
            } else {
                for (int j = 0; j < i - number; j++) {
                    System.out.print("   ");
                }
                for (int k = b - 1; k > 0; k--) {
                    System.out.print(k);
                }
                for (int l = 2; l < b; l++) {
                    System.out.print(l);
                }
                b--;
            }
            System.out.println();
        }
    }
}

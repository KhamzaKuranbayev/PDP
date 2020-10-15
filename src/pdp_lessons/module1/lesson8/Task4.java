package pdp_lessons.module1.lesson8;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Sum = " + getSum(arr) + " Multiply = " + getMultiply(arr));
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;

        return sum;
    }

    public static int getMultiply(int[] arr) {
        int multiply = 1;
        for (int num : arr)
            multiply *= num;

        return multiply;
    }

}

package pdp_lessons.module2.lesson9.task8;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> predicate = Main::isPrime;

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(nums, predicate));

    }

    public static boolean isPrime(Integer number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }
        return count == 2;
    }

    private static int sum(Integer[] nums, Predicate<Integer> predicate) {
        int sum = 0;
        for (int num : nums) {
            if (predicate.test(num)) {
                sum += num;
            }
        }
        return sum;
    }
}

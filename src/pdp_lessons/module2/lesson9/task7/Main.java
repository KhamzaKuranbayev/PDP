package pdp_lessons.module2.lesson9.task7;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> predicate = num -> num % 2 != 0;
        Integer[] nums = {6, 9, 16, 19, 26};
        System.out.println(sum(nums, predicate));
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

package pdp_lessons.module2.lesson9.task6;

public class Main {
    public static void main(String[] args) {

        Expression<Integer> expression = num -> num > 0;
        Integer[] nums = {5, 10, 15, 20, 25};
        System.out.println(sum(nums, expression));

    }

    private static int sum(Integer[] nums, Expression<Integer> expression) {
        int sum = 0;
        for (int num : nums) {
            if (expression.isEqual(num)) {
                sum += num;
            }
        }
        return sum;
    }
}

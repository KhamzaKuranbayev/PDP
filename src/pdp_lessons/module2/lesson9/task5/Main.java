package pdp_lessons.module2.lesson9.task5;

public class Main {
    public static void main(String[] args) {

        SumElements<Integer> sumElementsOfArray = arr -> {
            int sum = 0;
            for (int item : arr)
                sum += item;
            return sum;
        };

        Integer[] nums = {1, 3, 5, 7, 9};
        System.out.println(sumElementsOfArray.sum(nums));
    }
}

package pdp_lessons.module2.lesson9.task4;

public class Main {
    public static void main(String[] args) {
        FindNumberInArray<Integer> findNumberInArray = (number, arr) -> {
            for (int item : arr) {
                if (item == number)
                    return true;
            }
            return false;
        };
        Integer[] nums = {5, 10, 15, 20};
        System.out.println(findNumberInArray.hasNumber(150, nums));
    }
}

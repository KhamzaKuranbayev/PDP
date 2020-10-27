package pdp_lessons.module2.lesson9.task3;

public class Main {
    public static void main(String[] args) {
        MaxItemArray<Integer> max = arr -> getMax(arr);

        Integer[] numbers = {1, 5, 11, 3, 7, 4};
        System.out.println(max.max(numbers));

    }

    public static Integer getMax(Integer[] arr) {
        int max = arr[0];
        for(int item: arr) {
            if(max < item)
                max = item;
        }
        return max;
    }
}

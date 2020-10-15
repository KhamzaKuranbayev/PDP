package pdp_lessons.module1.lesson8;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 11};
        System.out.println(getSumArray(arr));
    }

    public static int getSumArray(int[] arr) {
        int sum = 0;
        boolean notFound = true;
        for (int num : arr) {
            if (num % 2 == 1) {
                sum += num;
                notFound = false;
                break;
            }
            sum += num;
        }
        if (notFound)
            sum -= arr[0] + arr[arr.length - 1];

        return sum;
    }

}

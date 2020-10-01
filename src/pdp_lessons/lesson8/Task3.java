package pdp_lessons.lesson8;

public class Task3 {

    public static void main(String[] args) {

        int[] arr = {21};
        System.out.println("Massivda 3 ga bo’linadigan lekin 7 bo’linmaydigan " + getNumbers(arr) + " ta son bor");
    }

    public static int getNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 3 == 0 && num % 7 != 0)
                count++;
        }
        return count;
    }
}

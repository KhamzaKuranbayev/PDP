package pdp_lessons.module2.lesson10.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(50);

        for (int i = 0; i < 50; i++) {
            numbers.add((int) (Math.random() * 101));
        }

        numbers.sort(Comparator.comparing(Integer::intValue).reversed());

        numbers.forEach(integer -> System.out.print(integer + " "));

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        nameList.forEach(System.out::println);
    }
}

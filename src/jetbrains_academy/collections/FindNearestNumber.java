package jetbrains_academy.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class FindNearestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> newList = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int nearTo = numbers.get(0);
        int nearAfter = 1;


        for (Integer number : numbers) {
            if (number < n) {
                if (nearTo <= n - number)
                    nearTo = n - number;
            }
            if (number > n) {
                if (nearAfter > number - n)
                    nearAfter = number - n;
            }
        }

        for (Integer number : numbers) {
            if(number == nearTo || number == nearAfter)
                newList.add(number);
        }

        numbers.sort(Comparator.comparingInt(o -> o));

        numbers.forEach(System.out::println);

    }
}

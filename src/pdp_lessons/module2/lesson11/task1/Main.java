package pdp_lessons.module2.lesson11.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // 1)	Ichida String toifasidagi elementlarni saqlaydigan set yarating va ichiga 10 ta element kiriting
        Set<String> set = new HashSet<>(10);
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Six");
        set.add("Seven");
        set.add("Eight");
        set.add("Nine");
        set.add("Ten");

        // 2)	Set barcha elementlarini iterator orqali ekranga chiqazing
        System.out.println("Iterator:  ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nFor-each:  ");
        // 3)	Set barcha elementlarini forEach methodi orqali ekranga chiqazing
        set.forEach(System.out::println);

    }
}

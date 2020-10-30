package pdp_lessons.module2.lesson11.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1)	Elementlari butun sonlardan iborat va elementlarini kiritish tartibida saqlovchi set yarating.
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // 2)	Set ga random qilish orqali qiymati 300 dan 500 gacha bo’lgan 100 ta son kiriting.
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            linkedHashSet.add(random.nextInt(200) + 300);
        }
        System.out.println("300 dan 500 gacha 100 ta random son: ");
        linkedHashSet.forEach(integer -> System.out.print(integer + " "));

        // 3)	Qiymati 400 dan katta bo’lgan elementlarini o’chiring.
        linkedHashSet.removeIf(integer -> integer > 400);

        System.out.println("\n\n400 dan katta sonlar o'chirildi: ");
        linkedHashSet.forEach(integer -> System.out.print(integer + " "));
    }
}

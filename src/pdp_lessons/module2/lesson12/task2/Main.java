package pdp_lessons.module2.lesson12.task2;

import pdp_lessons.module2.lesson12.task1.Fruit;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<pdp_lessons.module2.lesson12.task1.Fruit, Integer> fruitIntegerMap = new HashMap<>();

        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Anor", "Quva anor", 0), 15000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Anor", "Tuya tish anor", 0), 15000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Anor", "Surxon anor", 0), 15000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Olma", "Besh yuldiz olma", 0), 15000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Olma", "Golden olma", 0), 15000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Olma", "Qirmizi olma", 0), 15000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Olma", "Semerenka olma", 0), 15000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Banan", "Bananza banan", 5), 30000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Banan", "Boshqa banan", 5), 15000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Shaftoli", "Tukli shaftoli", 0), 6000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Shaftoli", "Tuksiz shaftoli", 0), 8000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Kivi", "Import kivi", 0), 21000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Kivi", "Mahalliy kivi", 0), 20000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Qulupnay", "Yirik qulupnay", 0), 18000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Qulupnay", "Mayda qulupnay", 0), 9000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Uzum", "Qora uzum", 0), 10000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("Uzum", "Husayni uzum", 0), 15000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("O'rik", "Surxon o’rik", 0), 3000);
        fruitIntegerMap.put(new pdp_lessons.module2.lesson12.task1.Fruit("O'rik", "Oq o’rik", 0), 2000);
        fruitIntegerMap.put(new Fruit("O'rik", "Yirik o’rik", 0), 12000);

        // 1.	Nomi “A” harfi bilan boshlanuvchi mevalarni narxlari bilan ekranga chiqazing
        System.out.println("Nomi “A” harfi bilan boshlanuvchi mevalar:");
        System.out.println("----------------------------------------------------");
        fruitIntegerMap.forEach((fruit, cost) -> {
            if (fruit.getName().startsWith("A")) {
                if (fruit.getSale() > 0)
                    cost -= (fruit.getSale() * cost) / 100;

                System.out.println(fruit.toString() + ", Narxi: " + cost);
            }
        });
        // 2.	Narxi 5000 so’mdan qimmat bo’lgan mevalarni narxlari bilan ekranga chiqazing
        System.out.println("\n\nNarxi 5000 so’mdan qimmat bo’lgan mevalar:");
        System.out.println("----------------------------------------------------");
        fruitIntegerMap.forEach((fruit, cost) -> {
            if (fruit.getSale() > 0)
                cost -= (fruit.getSale() * cost) / 100;

            if (cost > 5000)
                System.out.println(fruit.toString() + ", Narxi: " + cost);
        });

        // 3.	Barcha mevalarning narxini 10% arzonlashtiring
        System.out.println("\n\nBarcha mevalarning narxi 10% arzonlashtirildi:");
        System.out.println("----------------------------------------------------");
        fruitIntegerMap.forEach((fruit, cost) -> {
            int oldCost = cost;
            cost -= (10 * cost) / 100;

            fruitIntegerMap.put(fruit, cost);
            System.out.println(fruit.toString() + ", Narxi: " + cost + " (Oldingi Narxi: " + oldCost + ")");
        });


        // 4.	Narxi 10000 so’mdan qimmat mevalarning narxini 20% ga arzonlashtiring
        System.out.println("\n\nNarxi 10 000 so’mdan qimmat mevalarning narxi 20% ga arzonlashtirildi:");
        System.out.println("---------------------------------------------------------------------------");
        fruitIntegerMap.forEach((fruit, cost) -> {
            int oldCost = cost;
            if (cost > 10000) {
                cost -= (20 * cost) / 100;

                fruitIntegerMap.put(fruit, cost);
            }
            System.out.println(fruit.toString() + ", Narxi: " + cost + " (Oldingi Narxi: " + oldCost + ")");
        });

        // 5.	Narxi 20000 so’mdan qimmat mevalarning narxini 30% ga arzonlashtiring  va 10% chegirma bering
        System.out.println("\n\nNarxi 20 000 so’mdan qimmat mevalarning narxi 30% ga arzonlashtirildi va 10% chegirma berildi:");
        System.out.println("---------------------------------------------------------------------------");
        fruitIntegerMap.forEach((fruit, cost) -> {
            int oldCost = cost;
            if (cost > 20000) {
                cost -= (30 * cost) / 100;
                fruit.setSale(10);
                cost -= (fruit.getSale() * cost) / 100;

                fruitIntegerMap.put(fruit, cost);
            }
            System.out.println(fruit.toString() + ", Narxi: " + cost + " (Oldingi Narxi: " + oldCost + ")");
        });


    }
}

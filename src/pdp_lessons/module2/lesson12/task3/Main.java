package pdp_lessons.module2.lesson12.task3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;

public class Main {
    static int sum = 0;

    public static void main(String[] args) {
        Map<Fruit, Integer> fruitIntegerMap = new HashMap<>();

        fruitIntegerMap.put(new Fruit("Anor", "Quva anor", 0), 15000);
        fruitIntegerMap.put(new Fruit("Anor", "Tuya tish anor", 0), 15000);
        fruitIntegerMap.put(new Fruit("Anor", "Surxon anor", 0), 15000);
        fruitIntegerMap.put(new Fruit("Olma", "Besh yuldiz olma", 0), 15000);
        fruitIntegerMap.put(new Fruit("Olma", "Golden olma", 0), 15000);
        fruitIntegerMap.put(new Fruit("Olma", "Qirmizi olma", 0), 15000);
        fruitIntegerMap.put(new Fruit("Olma", "Semerenka olma", 0), 15000);
        fruitIntegerMap.put(new Fruit("Banan", "Bananza banan", 5), 30000);
        fruitIntegerMap.put(new Fruit("Banan", "Boshqa banan", 5), 15000);
        fruitIntegerMap.put(new Fruit("Shaftoli", "Tukli shaftoli", 0), 6000);
        fruitIntegerMap.put(new Fruit("Shaftoli", "Tuksiz shaftoli", 0), 8000);
        fruitIntegerMap.put(new Fruit("Kivi", "Import kivi", 0), 21000);
        fruitIntegerMap.put(new Fruit("Kivi", "Mahalliy kivi", 0), 20000);
        fruitIntegerMap.put(new Fruit("Qulupnay", "Yirik qulupnay", 0), 18000);
        fruitIntegerMap.put(new Fruit("Qulupnay", "Mayda qulupnay", 0), 9000);
        fruitIntegerMap.put(new Fruit("Uzum", "Qora uzum", 0), 10000);
        fruitIntegerMap.put(new Fruit("Uzum", "Husayni uzum", 0), 15000);
        fruitIntegerMap.put(new Fruit("O'rik", "Surxon o’rik", 0), 3000);
        fruitIntegerMap.put(new Fruit("O'rik", "Oq o’rik", 0), 2000);
        fruitIntegerMap.put(new Fruit("O'rik", "Yirik o’rik", 0), 12000);

        // 1.	Barcha mevalarning o’rtacha narxini aniqlang.(lambda orqali)
        fruitIntegerMap.forEach((fruit, cost) -> {
            if (fruit.getSale() > 0)
                cost -= (fruit.getSale() * cost) / 100;
            fruitIntegerMap.put(fruit, cost);
        });

        fruitIntegerMap.forEach((fruit, cost) -> {
            sum += cost;
        });
        System.out.println("Barcha mevalarning o’rtacha narxi: " + (sum / fruitIntegerMap.size()));

        // 2.	Barcha olmalarning narxini 5% oshiring
        System.out.println("\n\nBarcha olmalarning narxini 5% oshirildi:");
        fruitIntegerMap.forEach((fruit, cost) -> {
            int oldCost = cost;
            if (fruit.getName().equals("Olma")) {
                cost += (5 * cost) / 100;
                fruitIntegerMap.put(fruit, cost);
            }

            System.out.println(fruit.toString() + ", Narxi: " + cost + " (Oldingi Narxi: " + oldCost + ")");
        });

        // 3.	Barcha mevalarning nomini ekranga chiqazing;
        System.out.println("\n\nBarcha mevalarning nomi:");
        ValueComparator valueComparator = new ValueComparator();
        TreeMap<Fruit, Integer> treeMap = new TreeMap<>(valueComparator);

        treeMap.putAll(fruitIntegerMap);
        treeMap.forEach((fruit, integer) -> System.out.println(fruit.getName()));

        // 4.	Barcha mevalarni ekranga chiqazing;
        System.out.println("\n\nBarcha mevalar:");
        fruitIntegerMap.forEach((fruit, cost) -> {
            System.out.println(fruit.toString());
        });

        // 5.	Barcha narxlarni ekranga chiqazing;
        System.out.println("\n\nBarcha narxlar:");
        fruitIntegerMap.forEach((fruit, cost) -> {
            System.out.println(cost);
        });
    }
}

class ValueComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}

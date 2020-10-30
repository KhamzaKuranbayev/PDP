package pdp_lessons.module2.lesson12.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1.	Nomi(name), navi(type) va chegirma(sale) fieldlari bor bo’lgan Fruit klassini yarating

        // 2.	Mevalar  va  ularning narxlaridan map yarating.
        Map<Fruit, Integer> fruitIntegerMap = new HashMap<>();

        // 3.	Jadvalda berilgan barcha mevalarni mapga joylashtiring
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

        // 4.	Mapda nechta meva borligini ekranga chiqazing
        System.out.println("Mapda " + fruitIntegerMap.size() + " ta meva mavjud");

        // 5.	Barcha mevalarni narxlari bilan ekranga chiqazing
        fruitIntegerMap.forEach((fruit, cost) -> {
            if (fruit.getSale() > 0) {
                cost -= (fruit.getSale() * cost) / 100;
            }
            System.out.println(fruit.toString() + ", Narxi: " + cost);
        });


    }
}

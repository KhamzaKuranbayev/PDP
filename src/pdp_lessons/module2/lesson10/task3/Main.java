package pdp_lessons.module2.lesson10.task3;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        /*
            1)	Rangi, modeli va davlat raqami fieldlari bor bo’lgan Car klassini yarating.
             Main classida Car classidan 10 ta bir xil bo’lmagan object oling.
             Ichida Car toifasidagi elementlarni saqlaydigan cars nomli List yarating va
             10 ta elementni joylashtiring.
        */

        Car[] carsArr = new Car[10];
        carsArr[0] = new Car("White", "Nexia", "AA602");
        carsArr[1] = new Car("Red", "Spark", "AA603");
        carsArr[2] = new Car("Blue", "Damas", "AA604");
        carsArr[3] = new Car("Black", "Lacetti", "AA605");
        carsArr[4] = new Car("Silver", "Matiz", "AA606");
        carsArr[5] = new Car("Dark Blue", "Cobalt", "AA607");
        carsArr[6] = new Car("Dark Gray", "Captiva", "AA608");
        carsArr[7] = new Car("Dark Green", "Epica", "AA609");
        carsArr[8] = new Car("Light Brown", "Lada", "AA610");
        carsArr[9] = new Car("Bright Red", "Tico", "AA611");

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(carsArr));

        // 2)	Indexdan foydalangan holda cars elementlarini ekranga chiqazing
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString());
        }

        // 3)	List ichidan elementlarni random qilib oladigan method yozing.
        System.out.println();
        System.out.println("Random element of list: " + getRandomCar(cars).toString());

        /*
            4)	Uzunligi 5 ga teng bo’lgan, ichida Car toifasidagi elementlarni saqlaydigan
             cars1 nomli boshqa list yarating va uni ichini to’ldiring.
             cars1 list elementlarini cars listning 2 indexidan boshlab joylashtiring
         */
        ArrayList<Car> cars1 = new ArrayList<>(5);
        cars1.add(new Car("Green", "BMW", "BB1234"));
        cars1.add(new Car("Yellow", "Bugatti", "BB1235"));
        cars1.add(new Car("White", "Cadillac", "BB1236"));
        cars1.add(new Car("Black", "Ferrari", "BB1237"));
        cars1.add(new Car("Brown", "Fiat", "BB1238"));

        System.out.println("\n\n");
        cars.addAll(2, cars1);
        for (Car car : cars) {
            System.out.println(car.toString());
        }

        // 5)	cars listni model bo’yicha saralang

        // A. Comaparator class
        //cars.sort(new ModelSorter());

        // B. Lambda Expression
        //cars.sort((o1, o2) -> o1.getModel().compareToIgnoreCase(o2.getModel()));

        // C. Comparator.comapring method
        Comparator<Car> carComparator = (o1, o2) -> o1.getModel().compareToIgnoreCase(o2.getModel());
        cars.sort(carComparator);

        System.out.println("\nSorted by Model");
        for (Car car : cars) {
            System.out.println(car.toString());
        }

        // 6)	cars listidan cars1 listida bor bo’lgan elementlarni o’chiring
        cars.removeAll(cars1);

        System.out.println("\nRemoved cars1");
        for (Car car : cars) {
            System.out.println(car.toString());
        }

       //  7)	cars listidan cars1 listida yo’q bo’lgan elementlarni o’chiring
        cars.removeIf(car -> !cars1.contains(car)); // bu method ishlashi uchun 75 - qatordagi kodni comment qilib turish kerak

        System.out.println("\ncars2");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }

    public static Car getRandomCar(ArrayList<Car> cars) {
        Random random = new Random();
        return cars.get(random.nextInt(cars.size()));
    }
}

class ModelSorter implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getModel().compareToIgnoreCase(o2.getModel());
    }
}

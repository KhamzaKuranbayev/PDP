package jetbrains_academy.others;

public class CounterCats {
    public static void main(String[] args) {
        Cat cat1 = new Cat("ss", 15);
        Cat cat2 = new Cat("ss", 15);
        Cat cat3 = new Cat("ss", 15);
        Cat cat4 = new Cat("ss", 15);
        Cat cat5 = new Cat("ss", 15);
        Cat cat6 = new Cat("ss", 15);
        Cat cat7 = new Cat("ss", 15);
        System.out.println(Cat.getNumberOfCats());
    }
}

class Cat {

    // write static and instance variables
    public static String name;
    public static int age;
    public static int counter = 0;

    Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        name = name;
        age = age;

        if (counter > 5) {
            System.out.println("You have too many cats");
        }
        counter++;
    }

    static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}

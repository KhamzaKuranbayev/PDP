public class Complex {
    double real;
    double image;

    public void add(Complex complex) {
        real += complex.real;
        image += complex.image;
    }
}

class Person {

    private static long nextId = 1;

    long id;
    String name;

    public Person(String name) {
        this.name = name; // (2)
        this.id = nextId;
        this.nextId++; // (3)
    }

    public static long getNextId() { // (4)
        return nextId;
    }
}

    class Test {

    public static void main(String args[]) {

        Person person = new Person("R. Johnson");

        System.out.println(Person.getNextId()); // (1)
    }
}


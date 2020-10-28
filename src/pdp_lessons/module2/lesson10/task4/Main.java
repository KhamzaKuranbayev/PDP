package pdp_lessons.module2.lesson10.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 1)	Elementlarini alfabet tartibida joylashtiruvchi
        // Ismlarni saqlovchi list yarating va uni 10 ta element bilan to’ldiring

        ArrayList<Name> names = new ArrayList<>();
        names.add(new Name("Sobir"));
        names.add(new Name("Ahmad"));
        names.add(new Name("Bobur"));
        names.add(new Name("Anvar"));
        names.add(new Name("Zokir"));
        names.add(new Name("Shokir"));
        names.add(new Name("Kamol"));
        names.add(new Name("Bekzod"));
        names.add(new Name("Sherzod"));
        names.add(new Name("Dilshod"));

        for (Name name : names)
            System.out.println(name.toString());

        // 2)	Ismlar joylashgan listdan “A” harfidan boshlangan ismlarni o’chiring.
        names.removeIf(name -> name.getName().startsWith("A"));


        System.out.println("\nRemoved name starts with 'A'");
        for (Name name : names)
            System.out.println(name.toString());
    }
}

class Name implements Comparable<Name> {

    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Name o) {
        return getName().compareToIgnoreCase(o.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}

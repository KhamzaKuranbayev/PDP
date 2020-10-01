import java.util.Scanner;

public class Army {
    public static void main(String[] args) {
//        createArmy();
//        System.out.println(Unit.countUnit);
//        System.out.println(Knight.countKnight);
//        System.out.println(General.countGeneral);
//        System.out.println(Doctor.countDoctor);

        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }

    private static String prepareFullName(String firstName, String lastName) {
        if (firstName == null && lastName != null)
            return " " + lastName;
        else if (firstName != null && lastName == null)
            return firstName + " ";
        else
            return firstName + " " + lastName;

    }

    private static void createArmy() {
        for (int i = 0; i < 5; i++) {
            new Unit("The name of unit");
        }

        for (int i = 0; i < 3; i++) {
            new Knight("The name of knight");
        }

        new General("The name of general");
        new Doctor("The name of doctor");
    }

    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;
        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;
        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;
        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;
        }
    }
}

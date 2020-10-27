package pdp_lessons.module2.extraTask.task6;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        int index;

        District[] districts = new District[1];
        Region[] regions = new Region[12];

        districts[0] = new District("Shavat", 460, 136200,
                new Khokim("Otaxonov", "Hakimboy",
                        "Shavat district, Turkiston street", 3));

        regions[4] = new Region("Xorazm", 6300, 1810000,
                new Khokim("Ermanov", "Farhod",
                        "Qoraqolpog'iston Republic, Amudaryo district", 5), districts);

        regions[0] = new Region("Andijan", 0, 0, null, null);
        regions[1] = new Region("Bukhara", 0, 0, null, null);
        regions[2] = new Region("Fergana", 0, 0, null, null);
        regions[3] = new Region("Jizzakh", 0, 0, null, null);
        regions[5] = new Region("Namangan", 0, 0, null, null);
        regions[6] = new Region("Navoiy", 0, 0, null, null);
        regions[7] = new Region("Qashqadaryo", 0, 0, null, null);
        regions[8] = new Region("Samarqand", 0, 0, null, null);
        regions[9] = new Region("Sirdaryo", 0, 0, null, null);
        regions[10] = new Region("Surxondaryo", 0, 0, null, null);
        regions[11] = new Region("Tashkent", 0, 0, null, null);


        Republic republic = new Republic("Uzbekistan", 448978, 33000000,
                new President("Shavkat", "Mirziyoyev", "Jizzax region. Zomin district", 3), regions);


        while (true) {
            printArea();
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\nInfo");
                System.out.println("-----------------------------------------------");
                republic.printInfo(republic.getAreaName(), republic.areaSize, republic.areaPopulation);
                republic.getPresident().printJob("President"); // respublika ni prezidenti
                republic.getPresident().printInfo();
                System.out.println(republic.getPresident().toString());
                System.out.println("-----------------------------------------------");

                Region[] regions1 = republic.getRegions();
                boolean b1 = true;
                while (b1) {
                    System.out.println("\nChoose the region of " + republic.getAreaName() + ": ");
                    index = 1;
                    for (Region region : regions1) {
                        System.out.println(index + ". " + region.getAreaName());
                        index++;
                    }
                    choice = scanner.nextInt();
                    if (choice == 5) {
                        System.out.println("\nInfo");
                        System.out.println("-----------------------------------------------");
                        republic.printInfo(regions1[4].getAreaName(), regions1[4].areaSize, regions1[4].areaPopulation);
                        regions1[4].getKhokim().printJob("Khokim");
                        regions1[4].getKhokim().printInfo();
                        System.out.println(regions1[4].getKhokim().toString());
                        System.out.println("-----------------------------------------------");

                        District[] districts1 = regions1[4].getDistricts();
                        boolean b2 = true;
                        while (b2) {
                            System.out.println("\nChoose the district of " + regions1[4].getAreaName() + ": ");
                            index = 1;
                            for (District district : districts1) {
                                System.out.println(index + ". " + district.getAreaName());
                                index++;
                            }
                            choice = scanner.nextInt();
                            if (choice == 1) {
                                System.out.println("\nInfo");
                                System.out.println("-----------------------------------------------");
                                republic.printInfo(districts[0].getAreaName(), districts[0].areaSize, districts[0].areaPopulation);
                                districts[0].getKhokim().printJob("Khokim");
                                districts[0].getKhokim().printInfo();
                                System.out.println(districts[0].getKhokim().toString());
                                System.out.println("-----------------------------------------------\n\n");
                                b2 = false;
                            }
                        }

                        b1 = false;
                    }
                }
            } else {
                System.exit(0);
            }
        }
    }

    public static void printArea() {
        System.out.println("Choose the Republic:");
        System.out.println("1. Uzbekistan");
    }
}

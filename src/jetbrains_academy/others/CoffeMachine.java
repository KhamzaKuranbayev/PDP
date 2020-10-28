package jetbrains_academy.others;

import java.util.Scanner;

public class CoffeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;
        int money = 550;

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();

            switch (action) {
                case "buy": {
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String wantToBuy = scanner.next();

                    if (wantToBuy.equals("1") || wantToBuy.equals("2") || wantToBuy.equals("3")) {
                        if (isNotEnoughResources(water, milk, coffeeBeans, disposableCups, wantToBuy)) {
                            break;
                        } else {
                            System.out.println("I have enough resources, making you a coffee!\n");
                        }
                    }

                    switch (wantToBuy) {
                        case "1":
                            water -= 250;
                            coffeeBeans -= 16;
                            disposableCups -= 1;
                            money += 4;
                            break;
                        case "2":
                            water -= 350;
                            milk -= 75;
                            coffeeBeans -= 20;
                            disposableCups -= 1;
                            money += 7;
                            break;
                        case "3":
                            water -= 200;
                            milk -= 100;
                            coffeeBeans -= 12;
                            disposableCups -= 1;
                            money += 6;
                            break;
                        case "back":
                            System.out.println();
                            break;
                        default:
                            break;
                    }
                    break;
                }
                case "fill": {
                    System.out.println();
                    System.out.println("Write how many ml of water do you want to add: ");
                    String water_ml = scanner.next();
                    water += Integer.parseInt(water_ml);

                    System.out.println("Write how many ml of milk do you want to add: ");
                    String milk_ml = scanner.next();
                    milk += Integer.parseInt(milk_ml);

                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    String coffeeBeans_gr = scanner.next();
                    coffeeBeans += Integer.parseInt(coffeeBeans_gr);

                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    String disposable_cups = scanner.next();
                    disposableCups += Integer.parseInt(disposable_cups);

                    System.out.println();
                    break;
                }
                case "take": {
                    System.out.println();
                    System.out.println("I gave you $" + money);
                    money = 0;
                    printCoffeeMachine(water, milk, coffeeBeans, disposableCups, money);
                    break;
                }
                case "remaining":
                    printCoffeeMachine(water, milk, coffeeBeans, disposableCups, money);
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }
        }
    }

    public static boolean isNotEnoughResources(int water, int milk, int coffeeBeans, int disposableCups, String option) {
        if (disposableCups - 1 < 0) {
            System.out.println("Sorry, not enough disposable cups!\n");
        } else {
            switch (option) {
                case "1":
                    if (water - 250 < 0) {
                        System.out.println("Sorry, not enough water!\n");
                        return true;
                    }
                    if (coffeeBeans - 16 < 0) {
                        System.out.println("Sorry, not enough coffee beans!\n");
                        return true;
                    }
                    break;
                case "2":
                    if (water - 350 < 0) {
                        System.out.println("Sorry, not enough water!\n");
                        return true;
                    }
                    if (milk - 75 < 0) {
                        System.out.println("Sorry, not enough milk!\n");
                        return true;
                    }
                    if (coffeeBeans - 20 < 0) {
                        System.out.println("Sorry, not enough coffee beans!\n");
                        return true;
                    }
                    break;
                case "3":
                    if (water - 200 < 0) {
                        System.out.println("Sorry, not enough water!\n");
                        return true;
                    }
                    if (milk - 100 < 0) {
                        System.out.println("Sorry, not enough milk!\n");
                        return true;
                    }
                    if (coffeeBeans - 12 < 0) {
                        System.out.println("Sorry, not enough coffee beans!\n");
                        return true;
                    }
                    break;

            }
        }
        return false;
    }

    public static void printCoffeeMachine(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money\n");
    }
}

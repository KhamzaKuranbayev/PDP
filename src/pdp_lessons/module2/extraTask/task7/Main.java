package pdp_lessons.module2.extraTask.task7;

import java.awt.*;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int nullsCount = 0;
    static int ticketId = 0;
    static int index = 0;

    public static void main(String[] args) {

        int choice;
        String station;

        User[] users = new User[1];
        users[0] = new User(1, "khamza@mail.ru", "Khamza", "Kuranbayev", "qwert123",
                "passport", "AA123456");

        Ticket[] tickets = new Ticket[5];
        tickets[0] = new Ticket(1, "БУХАРА 1", "ТАШКЕНТ ЮЖ",
                2, 375540, new Train("071Ф", 100));
        tickets[1] = new Ticket(2, "КУНГРАД", "ТАШКЕНТ Ц",
                3, 193240, new Train("056Ж", 120));
        tickets[2] = new Ticket(3, "ХИВА", "ТАШКЕНТ ЮЖ",
                1, 128180, new Train("765Ф", 100));
        tickets[3] = new Ticket(4, "ТАШКЕНТ ЮЖ", "АНДИЖАН 1",
                2, 100000, new Train("092Ф", 100));
        tickets[4] = new Ticket(5, "ТАШКЕНТ Ц", "БУХАРА 1",
                3, 230000, new Train("762Ф", 100));


        TrainSchedule[] trainSchedules = new TrainSchedule[5];
        trainSchedules[0] = new TrainSchedule(tickets[0].getTrain(), "БУХАРА 1", "ТАШКЕНТ ЮЖ", 100);
        trainSchedules[1] = new TrainSchedule(tickets[1].getTrain(), "КУНГРАД", "ТАШКЕНТ Ц", 100);
        trainSchedules[2] = new TrainSchedule(tickets[2].getTrain(), "ХИВА", "ТАШКЕНТ ЮЖ", 100);
        trainSchedules[3] = new TrainSchedule(tickets[3].getTrain(), "ТАШКЕНТ ЮЖ", "АНДИЖАН 1", 100);
        trainSchedules[4] = new TrainSchedule(tickets[4].getTrain(), "ТАШКЕНТ Ц", "БУХАРА 1", 100);

        Order[] orders = new Order[100];

        while (true) {
            System.out.print("Login: ");
            String login = scanner.next();
            System.out.print("Password: ");
            String password = scanner.next();

            boolean findUser = false;
            User user = null;
            for (User user1 : users) {
                if (user1.login(login, password)) {
                    user = user1;
                    findUser = true;
                    break;
                }
            }

            if (findUser) {
                System.out.println("\n" + user.getFirstname() + " " + user.getLastname() + ", Welcome to E-ticket system!");

                boolean bool = true;
                while (bool) {
                    printOperations();
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Choose a station: ");
                            station = scanner.next();

                            boolean b = true;
                            while (b) {
                                System.out.println("1 - Arrival 2 - Departure 3 - Exit");
                                choice = scanner.nextInt();

                                switch (choice) {
                                    case 1:
                                        nullsCount = 0;
                                        System.out.println("Arrival:");
                                        printStationArrival(station, trainSchedules);
                                        break;
                                    case 2:
                                        nullsCount = 0;
                                        System.out.println("Departure:");
                                        printStationDeparture(station, trainSchedules);
                                        break;
                                    case 3:
                                        b = false;
                                        break;
                                }
                            }
                            break;
                        case 2:
                            System.out.print("\nFrom: ");
                            String from = scanner.next();
                            printStationDeparture(from, trainSchedules);

                            System.out.print("\nTo: ");
                            String to = scanner.next();

                            nullsCount = 0;
                            buyTicket(from, to, tickets, orders, user);

                            break;
                        case 3:
                            printMyOrders(user, orders);
                            break;
                        case 6:
                            System.out.println("Thank you for attention!");
                            bool = false;
                            break;
                    }
                }
                break;
            } else {
                System.out.println("Bunday foydalanuvchi tizimda yo'q!");
            }
        }
    }

    private static void printMyOrders(User user, Order[] orders) {
        for (Order order : orders) {
            if (order != null) {
                if (order.getUser().equals(user)) {
                    System.out.println(order.getTicket().getTicketNo() + "  " + order.getTicket().getTrain().getTrainNo()
                            + "  " + order.getTicket().getDepartureStation() + " --- " + order.getTicket().getDestinationStation());
                }
            }
        }
    }

    public static void printStationArrival(String station, TrainSchedule[] trainSchedules) {
        System.out.println("-------------------------------");
        for (TrainSchedule schedule : trainSchedules) {
            if (schedule != null) {
                if (schedule.getTo().contains(station)) {
                    System.out.println(schedule.getTrain().trainNo + "     " +
                            schedule.getFrom() + "     " + schedule.getTo());
                } else {
                    nullsCount++;
                }
            } else {
                nullsCount++;
            }
        }
        if (nullsCount == trainSchedules.length) {
            System.out.println("No data!");
        }
        System.out.println("-------------------------------\n");
    }

    public static void printStationDeparture(String station, TrainSchedule[] trainSchedules) {
        System.out.println("-------------------------------");
        for (TrainSchedule schedule : trainSchedules) {
            if (schedule != null) {
                if (schedule.getFrom().contains(station)) {
                    System.out.println(schedule.getTrain().trainNo + "     " +
                            schedule.getFrom() + "     " + schedule.getTo());
                } else {
                    nullsCount++;
                }
            } else {
                nullsCount++;
            }
        }
        if (nullsCount == trainSchedules.length) {
            System.out.println("No data!");
        }
        System.out.println("-------------------------------\n");
    }

    public static void buyTicket(String from, String to, Ticket[] tickets,
                                 Order[] orders, User user) {
        System.out.println("-------------------------------");
        for (Ticket ticket : tickets) {
            if (ticket != null) {
                if (ticket.getDepartureStation().contains(from) && ticket.getDestinationStation().contains(to)) {
                    String classCategory = "";
                    if (ticket.getClassCategory() == 1) {
                        classCategory = "first class";
                    } else if (ticket.getClassCategory() == 2) {
                        classCategory = "2 class";
                    } else {
                        classCategory = "3 class";
                    }
                    System.out.println(ticket.getTicketNo() + "   " +
                            ticket.getDepartureStation() + "  ---  " +
                            ticket.getDestinationStation() + "     "
                            + classCategory + "     " + ticket.getPrice() + " sum");

                    System.out.println("Do you buy this ticket? 1 - Yes 2 - No");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        orders[index] = new Order(index, user, ticket);
                        System.out.println("This ticket was purchased!");
                        index++;
                    } else {
                        System.out.println("The purchase of tickets was refused!");
                    }
                } else {
                    nullsCount++;
                }
            } else {
                nullsCount++;
            }
        }
        if (nullsCount == tickets.length) {
            System.out.println("No data!");
        }
        System.out.println("-------------------------------\n");
    }

    public static void printOperations() {

        System.out.println("\nChose the operation:");
        System.out.println("1. Train Schedule");
        System.out.println("2. Buy ticket");
        System.out.println("3. My Orders");
        System.out.println("4. Personal data");
        System.out.println("5. Chane password");
        System.out.println("6. Log out");

    }

}

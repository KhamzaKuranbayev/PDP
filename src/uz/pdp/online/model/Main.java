package uz.pdp.online.model;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[5];

        users[0] = new User(1, "user1", "user1@mail.ru", "123321", "Adham", "Toshkent");
        users[1] = new User(2, "user2", "user2@mail.ru", "234432", "Sobir", "Andijon");
        users[2] = new User(3, "user3", "user3@mail.ru", "345543", "Aziz", "Buxaro");
        users[3] = new User(4, "user4", "user4@mail.ru", "456654", "Abbos", "Samarqand");
        users[4] = new User(5, "user5", "user5@mail.ru", "567765", "Xurshid", "Jizzax");

        for(User user: users) {
            System.out.println(user.toString());
        }
    }
}

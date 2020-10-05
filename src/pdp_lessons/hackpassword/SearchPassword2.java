package pdp_lessons.hackpassword;

import java.util.Random;

public class SearchPassword2 {
    public static void main(String[] args) {
        // 3FAN
        System.out.print("Parol: ");
        String password = getRandomPassword();
        System.out.println(password);

        int count = 0;
        while (true) {
            String new_password = getRandomPassword();
            if (new_password.equals(password)) {
                count++;
                System.out.println("Parol: " + new_password + "; " + count + " ta urinishda topildi!");
                break;
            }
            count++;
        }
    }

    public static String getRandomPassword() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; // 36ta xona
        String password = "";
        Random random = new Random();

        while (true) {
            for (int i = 0; i < 4; i++) {
                password += str.charAt(random.nextInt(36));
                // KABC
            }

            if (isNumberLetter(password)) {
                return password;
            }
            password = "";
        }
    }

    public static boolean isNumberLetter(String str) {
        int countDigit = 0;
        int countLetter = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
                countDigit++;
            if (Character.isLetter(c))
                countLetter++;

        }
        return countDigit != 0 && countLetter != 0;
    }
}

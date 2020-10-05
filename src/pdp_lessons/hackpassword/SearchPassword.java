package pdp_lessons.hackpassword;
import java.util.Random;

public class SearchPassword {
    public static void main(String[] args) {
        System.out.print("Parol: ");
        int password = Integer.parseInt(getRandomPassword());
        System.out.println(password);
        int first = (int) Math.pow(10, (password + "").length() - 1);
        int last = 999999;
        int middle = 999999 / 2;
        int count = 0;
        while (first <= last) {
            if (middle < password) {
                first = middle + 1;
                count++;
            } else if (middle == password) {
                count++;
                System.out.println("Parol: " + middle + "; " + count + " ta urinishda topildi!");
                break;
            } else {
                last = middle - 1;
                count++;
            }
            middle = (first + last) / 2;
        }
    }

    public static String getRandomPassword() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        return String.format("%06d", number);
    }
}

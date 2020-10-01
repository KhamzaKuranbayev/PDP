import java.util.Random;

public class SearchPassword2 {
    public static void main(String[] args) {
        // 3FAN
        System.out.print("Parol: ");
        String password = getRandomPassword();
        System.out.println(password);

        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; // 29ta xona
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String new_password = "";

        // AAA0     AAB0    ABA0    BA
        // AAA1     AAB1    ABA1
        // AAA9     AAB9    ABA9

        // AA0A     AA0B    AB0A
        // AA1A     AA1B    AB1A
        // AA9A     AA9B    AB9A

        // A0AA     A0AB    A0BA
        // A1AA     A1AB    A1BA
        // A9AA     A9AB    A9BA

        // 0AAA     0AAB    0ABA
        // 1AAA     1AAB    1ABA
        // 9AAA     9AAB    9ABA

        char[] cc = new char[4];

        int index = 0;
        int count = 0;
        int a = 3;
        while (true) {
            char c = letters[index]; // A, B, C, D... Z

            for (int i = 0; i <= 9; i++) {
                for (int j = 0; j < 4; j++) {
                    cc[j] = c;
                }
                cc[a] = numbers[i];
                new_password = String.valueOf(cc);
                if (new_password.equals(password)) {
                    count++;
                    System.out.println("Parol: " + new_password + "; " + count + " ta urinishda topildi!");
                    System.exit(0);
                }
                count++;
            }
            a--;
            if (a < 0) {
                index++;
                a = 3;
            }

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

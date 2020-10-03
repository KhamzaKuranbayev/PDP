import javax.jws.soap.SOAPBinding;
import java.util.Arrays;
import java.util.Random;

public class SearchPassword3 {
    public static void main(String[] args) {
        System.out.print("Parol: ");
        String password = getRandomPassword();
        System.out.println(password);

        // 0 0 0 0
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        boolean isFound = false;
        int count = 0;
        for (int i = 0; i < 36; i++) {
            for (int j = 0; j < 36; j++) {
                for (int k = 0; k < 36; k++) {
                    for (int l = 0; l < 36; l++) {
                        String result = str.charAt(i) + "" + str.charAt(j) + "" + str.charAt(k) + "" + str.charAt(l);
                        if (isNumberLetter(result)) {
                            if (result.equals(password)) {
                                isFound = true;
                                count++;
                                System.out.println("Parol: " + result + "; " + count + " ta urinishda topildi!");
                            }
                        }
                        count++;
                    }
                    if (isFound)
                        break;
                }
                if (isFound)
                    break;

            }
            if (isFound)
                break;
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

package pdp_lessons.module2.lesson9.task10;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Character> predicate = ch -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int countVowel = 0;
        for (int i = 0; i < text.length(); i++) {
            Character ch = text.charAt(i);
            if (predicate.test(ch)) {
                countVowel++;
            }
        }
        System.out.println("Vowel count: " + countVowel);

    }
}

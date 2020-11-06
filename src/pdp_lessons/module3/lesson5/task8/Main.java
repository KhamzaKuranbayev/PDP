package pdp_lessons.module3.lesson5.task8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String> words = new LinkedHashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("oxford.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() > 2) {
                    String key = line.substring(0, line.indexOf(" "));
                    String value = line.substring(line.indexOf(" ") + 1);
                    words.put(key, value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.next();

        System.out.println("\nSearching ...");
        waiting(5);

        System.out.println("\nResult");
        System.out.println("--------------------------");
        System.out.println(words.get(word));
    }

    public static void waiting(int time) {
        LocalTime start = LocalTime.now();
        long second_count = 0;
        while (second_count <= time) {
            second_count = Duration.between(start, LocalTime.now()).getSeconds();
        }
    }
}

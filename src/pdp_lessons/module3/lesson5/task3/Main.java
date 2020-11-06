package pdp_lessons.module3.lesson5.task3;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("D:\\PDP");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Matn kiriting: ");
        String text = scanner.nextLine();

        infoDirFile(file, text);
    }

    public static void infoDirFile(File file, String text) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (File file1 : files) {
                if (file1.getName().contains(text)) {
                    System.out.println(file1.getAbsolutePath());
                }
                infoDirFile(file1, text);
            }
        } else {
            if (file.getName().contains(text)) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}

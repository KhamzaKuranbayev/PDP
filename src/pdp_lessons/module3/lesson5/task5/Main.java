package pdp_lessons.module3.lesson5.task5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\PDP");
        System.out.println("File lar ro'yhati:");
        getAllFiles(file);

        Scanner scanner = new Scanner(System.in);
        System.out.print("File nomini kiriting: ");
        String fileName = scanner.next();

        File file1 = getFile(fileName, file);
        if (file1 != null) {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\PDP\\" + file1.getName()));

            int maxLength = 0;
            String word = "";
            String line = reader.readLine();
            while (line != null) {
                if (line.length() > maxLength) {
                    maxLength = line.length();
                    word = line;
                }
                line = reader.readLine();
            }
            reader.close();

            System.out.println("Tanlangan file da eng uzun so'z " + word);
        } else {
            System.out.println("Bu nomdagi file topilmadi!");
        }
    }

    public static File getFile(String fileName, File file) {
        File[] files = file.listFiles();

        for (File file1 : files) {
            if (file1.getName().contains(fileName)) {
                return file1;
            }
        }
        return null;
    }

    public static void getAllFiles(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile())
                System.out.println(file1.getName());
        }
    }
}

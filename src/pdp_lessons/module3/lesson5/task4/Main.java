package pdp_lessons.module3.lesson5.task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Set<File> files = new HashSet<>();

        files.add(new File("D:\\PDP\\text1.txt"));
        files.add(new File("D:\\PDP\\text2.txt"));
        files.add(new File("D:\\PDP\\text3.txt"));
        files.add(new File("D:\\PDP\\text4.txt"));
        files.add(new File("D:\\PDP\\text5.txt"));

        /*
        File lar yaratildi
        files.forEach(file -> {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        */

        File file = new File("D:\\PDP");
        System.out.println("File lar ro'yhati:");
        getAllFiles(file);

        Scanner scanner = new Scanner(System.in);
        System.out.print("File nomini kiriting: ");
        String fileName = scanner.next();


        File file1 = getFile(fileName, file);
        if (file1 != null) {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\PDP\\" + file1.getName()));
            int lines = 0;
            while (reader.readLine() != null) lines++;
            reader.close();

            System.out.println("Tanlangan file da " + lines + " ta qator mavjud");
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

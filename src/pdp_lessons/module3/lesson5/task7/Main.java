package pdp_lessons.module3.lesson5.task7;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file1Copy = new File("D:/PDP/text1.txt");
        File file2Copy = new File("D:/PDP/text2.txt");

        File to = new File("D:/PDP/COPY/copied.txt");

        copy(file1Copy, file2Copy, to);

    }

    public static void copy(File file1, File file2, File to) {

        try (InputStream inputStream1 = new FileInputStream(file1);
             InputStream inputStream2 = new FileInputStream(file2);
             OutputStream outputStream = new FileOutputStream(to)) {

            byte[] bytes = new byte[inputStream1.available() + inputStream2.available()];

            int length = inputStream1.read(bytes) + inputStream2.read(bytes);
            if (length > 0) {
                outputStream.write(bytes, 0, length);
            }
            System.out.println("1- file va 2- file ma'lumotlari 3 - file ga yozildi");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}

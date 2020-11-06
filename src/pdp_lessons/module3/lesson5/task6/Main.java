package pdp_lessons.module3.lesson5.task6;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File from = new File("D:/PDP/text2.txt");
        File to = new File("D:/PDP/COPY/copied.txt");
        copy(from, to);
    }

    public static void copy(File from, File to) {

        try (InputStream inputStream = new FileInputStream(from);
             OutputStream outputStream = new FileOutputStream(to)) {

            byte[] bytes = new byte[inputStream.available()];

            int length = inputStream.read(bytes);
            if (length > 0) {
                outputStream.write(bytes, 0, length);
            }
            System.out.println("File dan nusxa olindi");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

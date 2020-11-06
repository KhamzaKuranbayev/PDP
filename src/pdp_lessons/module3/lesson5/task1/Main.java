package pdp_lessons.module3.lesson5.task1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(checkPathName(file));
    }

    public static String checkPathName(File file) {
        if (file.isDirectory())
            return "Papka";

        if (file.isFile())
            return "File";
        return "";
    }
}

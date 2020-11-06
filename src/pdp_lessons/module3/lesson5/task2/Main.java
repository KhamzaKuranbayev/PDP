package pdp_lessons.module3.lesson5.task2;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        try {
            /*
            Papka ichida papka va file yaratildi
            File file = new File("D:\\PDP\\TestFolder");
            file.mkdirs();

            file = new File("D:\\PDP\\test.txt");
            file.createNewFile();
            */

            File folder = new File("D:\\PDP");

            if (checkFolder(folder)) {
                System.out.println("Papka ichida papka va file bor!");
            } else {
                System.out.println("Papka ichida papka va file yo'q!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkFolder(File folder) {

        File[] lisOfFiles = folder.listFiles();

        if (lisOfFiles.length == 0) {
            return false;
        }
        int countFile = 0;
        int countFolder = 0;
        for (File lisOfFile : lisOfFiles) {
            if (lisOfFile.isFile())
                countFile++;
            if (lisOfFile.isDirectory())
                countFolder++;
        }
        return countFile != 0 && countFolder != 0;
    }
}

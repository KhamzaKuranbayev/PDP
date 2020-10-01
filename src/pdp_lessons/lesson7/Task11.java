package pdp_lessons.lesson7;

public class Task11 {
    public static void main(String[] args) {
        for(int i = 1000; i <= 9999; i++) {
            if(i % 47 == 43 && i % 43 == 4)
                System.out.print(i + " ");
        }
    }
}

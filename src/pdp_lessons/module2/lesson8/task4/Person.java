package pdp_lessons.module2.lesson8.task4;

public class Person implements Speakable {

    @Override
    public void speak(String author, String text) {
        System.out.println(author + " spoke " + text);
    }
}

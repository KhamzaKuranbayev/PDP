package pdp_lessons.module2.lesson1.task1;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printXY() {
        System.out.println(this.x + ";" + this.y);
    }
}

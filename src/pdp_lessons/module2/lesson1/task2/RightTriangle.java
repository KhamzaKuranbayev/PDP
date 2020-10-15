package pdp_lessons.module2.lesson1.task2;

public class RightTriangle {

    int width;
    int height;

    public RightTriangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printPerimeter() {
        int perimeter = (int) (this.width + this.height + Math.sqrt(width * width + height * height));
        System.out.println("Perimeter P = " + perimeter);
    }

    public void printAria() {
        double area = (double) (this.width * this.height) / 2;
        System.out.println("Yuzasi S = " + area);
    }

}

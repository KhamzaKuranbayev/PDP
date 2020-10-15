package pdp_lessons.module2.lesson1.task3;

public class MyClass {

    int firstAttribute;
    int secondAttribute;

    public MyClass(int firstAttribute, int secondAttribute) {
        this.firstAttribute = firstAttribute;
        this.secondAttribute = secondAttribute;
    }

    public void aboutAttributes() {
        System.out.println(this.firstAttribute + ", " + this.secondAttribute);
    }

    public void sumAttributes() {
        System.out.println(this.firstAttribute + this.secondAttribute);
    }

    public void maxAttribute() {
        System.out.println(Math.max(this.firstAttribute, this.secondAttribute));
    }
}

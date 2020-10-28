package jetbrains_academy.others;

public class A {
    private int x;

    public static void main(String[] args) {
        A a = new A();
        a.x = 5;
        A b = new A();
        b.x = 5;
        System.out.println(a.equals(b));
    }
}

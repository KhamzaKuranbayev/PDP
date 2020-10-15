package pdp_lessons.module1.lesson2;

public class VowelLettersUnicode {
    public static void main(String[] args) {
        int A = (int) 'jetbrains_academy.A';
        int a = (int) 'a';

        int E = (int) 'E';
        int e = (int) 'e';

        int I = (int) 'I';
        int i = (int) 'i';

        int O = (int) 'O';
        int o = (int) 'o';

        int U = (int) 'U';
        int u = (int) 'u';
        System.out.printf("jetbrains_academy.A unicode: U+%04x%na unicode: U+%04x%n" +
                "\nE unicode: U+%04x%ne unicode: U+%04x%n" +
                "\nI unicode: U+%04x%ni unicode: U+%04x%n" +
                "\nO unicode: U+%04x%no unicode: U+%04x%n" +
                "\nU unicode: U+%04x%nu unicode: U+%04x%n", A, a, E, e, I, i, O, o, U, u);
    }
}

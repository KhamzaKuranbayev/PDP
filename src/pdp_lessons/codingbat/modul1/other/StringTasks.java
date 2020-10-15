package pdp_lessons.codingbat.modul1.other;

import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(right2(a));
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2).concat(word).concat(out.substring(2));
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }

    public static String theEnd(String str, boolean front) {
        if (front) {
            return str.charAt(0) + "";
        }
        return str.charAt(str.length() - 1) + "";
    }

    public static String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public static String lastChars(String a, String b) {
        if (a.isEmpty())
            a = "@";
        if (b.isEmpty())
            b = "@";

        return a.substring(0, 1).concat(b.substring(b.length() - 1));
    }

    public static String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }

    public static String extraFront(String str) {
        if (str.length() > 1)
            return str.substring(0, 2).concat(str.substring(0, 2)).concat(str.substring(0, 2));
        return str.substring(0, 1).concat(str.substring(0, 1)).concat(str.substring(0, 1));
    }

    public static String left2(String str) {
        if (str.length() > 2)
            return str;
        return str.substring(2).concat(str.substring(0, 2));
    }

    public static String withoutX(String str) {
        if (str.length() == 1)
            return "";

        boolean b1 = str.startsWith("x");
        boolean b2 = str.endsWith("x");
        if (b1 && b2) {
            return str.substring(1, str.length() - 1);
        } else if (b1) {
            return str.substring(1);
        } else if (b2) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static String makeTags(String tag, String word) {
        return "<".concat(tag.concat(">".concat(word.concat("<".concat(tag.concat("/>"))))));
    }

    public static String right2(String str) {
        if (str.length() > 2) {
            return str.substring(str.length() - 2).concat(str.substring(0, str.length() - 2));
        }
        return str;
    }
}

package pdp_lessons.codingbat;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class CountCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(starOut2("sm**eil*ly"));
    }

    public static boolean endOther(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        if (a.length() >= b.length())
            return a.contains(b);
        return b.contains(a);
    }

    public static String starOut2(String str) {
        String a = "", b;
        if (str.contains("*")) {
            if (str.length() > 3) {
                if (!str.startsWith("*")) {
                    if (!str.endsWith("*")) {
                        for (int i = 1; i < str.length(); i++) {
                            if (str.charAt(i) == '*' && (str.charAt(i) == str.charAt(i + 1))) {
                                b = str.substring(i - 1, i + 3);
                                str = str.replace(b, a);
                                return str;
                            }
                            if (str.charAt(i) == '*') {
                                b = str.substring(i - 1, i + 2);
                                str = str.replace(b, a);
                                return str;
                            }
                        }
                    }
                    return str.substring(0, str.length() - 2);
                }
                return str.substring(2);
            }
            return "";
        }
        return str;
    }

    public static int countHi(String str) {
        int count = 0;
        while (str.length() != 0) {
            if (str.contains("hi")) {
                count++;
                str = str.substring(str.indexOf("hi") + 2);

            } else {
                break;
            }
        }
        return count;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static boolean bobThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                return true;
        }
        return false;
    }

    public static String repeatEnd(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++)
            result += str.substring(str.length() - n);
        return result;
    }

    public static boolean prefixAgain(String str, int n) {
        if (!str.isEmpty() && n >= 1 && n <= str.length()) {
            return str.substring(n).contains(str.substring(0, n));
        }
        return false;
    }

    public static boolean sameStarChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("*")) {
                int index = str.indexOf('*');
                if (index != 0 && str.substring(index - 1, index).equals(str.substring(index + 1, index + 2))) {
                    return true;
                }
                str = str.substring(index + 1);
            }
        }
        return false;
    }

    public static String starOut(String str) {
        if (!str.contains("*")) return str;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && i == 0) {
                if (str.length() == 1) {
                    str = str.replace('*', ' ');
                } else if (str.charAt(i + 1) != '*') {
                    str = str.replace(str.charAt(i + 1), ' ');
                }
            }
            if (str.charAt(i) == '*' && i == str.length() - 1) {
                if (str.charAt(i - 1) != '*') {
                    str = str.replace(str.charAt(i - 1), ' ');
                }
            }
            if (str.charAt(i) == '*' && i != 0 && i != str.length() - 1) {
                if (str.charAt(i - 1) != '*') {
                    str = str.replace(str.charAt(i - 1), ' ');
                }
                if (str.charAt(i + 1) != '*') {
                    str = str.replace(str.charAt(i + 1), ' ');
                }
            }

        }
        String result = "";
        if (str.contains("*")) {
            str = str.replace('*', ' ');
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            }
        }
        return result;
    }


}

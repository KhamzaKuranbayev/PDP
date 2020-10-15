package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(timeInWords(5, 45));
    }

    static String timeInWords(int h, int m) {
        String[] unity = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "twenty", "thirty", "forty", "fifty"};

        if (m == 0) {
            return unity[h] + " o' clock";
        }
        if (m <= 30) {
            String str = "";
            if (m == 15) {
                str = "quarter";
            }
            if (m == 30) {
                str = "half";
            }
            if (str.equals("")) {
                String str2;
                if (m == 1)
                    return "one minute past " + unity[h];
                if (m >= 20) {
                    str2 = (tens[m / 10 - 1] + " " + unity[m % 10]).trim();
                } else {
                    str2 = unity[m];
                }
                return str2 + " minutes past " + unity[h];
            } else {
                return str + " past " + unity[h];
            }
        } else {
            String str;
            if (m == 45) {
                return "quarter to " + unity[h + 1];
            } else {
                m = 60 - m;
                if (m == 1)
                    return "one minute to " + unity[h + 1];
                if (m >= 20) {
                    str = (tens[m / 10 - 1] + " " + unity[m % 10]).trim();
                } else {
                    str = unity[m];
                }
            }
            return str + " minutes to " + unity[h + 1];
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();

        for (int item : grades) {
            if (item >= 38) {
                int num = item % 5;
                if (num > 2)
                    item += 5 - num;
            }
            result.add(item);
        }
        return result;
    }

    static String timeConversion(String s) {
        String time = s.substring(0, s.length() - 2);
        int hour = Integer.parseInt(time.substring(0, 2));

        if (s.contains("AM")) {
            if (hour == 12)
                time = "00" + time.substring(2);
        }
        if (s.contains("PM")) {
            if (hour < 12)
                time = (hour + 12) + time.substring(2);
        }
        return time;
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);
        for (int item : candles) {
            if (item > max)
                max = item;
        }

        int count = 0;
        for (int item : candles) {
            if (item == max)
                count++;
        }
        return count;

    }

    static void miniMaxSum(int[] arr) {
        long number1 = (long) arr[0] + arr[1] + arr[2] + arr[3];
        long number2 = (long) arr[0] + arr[1] + arr[2] + arr[4];
        long number3 = (long) arr[0] + arr[1] + arr[3] + arr[4];
        long number4 = (long) arr[0] + arr[2] + arr[3] + arr[4];
        long number5 = (long) arr[1] + arr[2] + arr[3] + arr[4];

        long max = number1;
        long min = number2;

        if (number1 < number2) {
            max = number2;
            min = number1;
        }

        if (number3 > max) {
            max = number3;
        } else if (number3 < min) {
            min = number3;
        }

        if (number4 > max) {
            max = number4;
        } else if (number4 < min) {
            min = number4;
        }

        if (number5 > max) {
            max = number5;
        } else if (number5 < min) {
            min = number5;
        }

        System.out.println(min + " " + max);
    }

    static void staircase(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void plusMinus(int[] arr) {
        int n = arr.length;
        float positive = 0;
        float negative = 0;
        float zero = 0;

        for (int item : arr) {
            if (item > 0)
                positive++;
            if (item < 0)
                negative++;
            if (item == 0)
                zero++;
        }
        positive = positive / n;
        negative = negative / n;
        zero = zero / n;
        System.out.printf("%.6f\n%.6f\n%.6f", positive, negative, zero);

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int onFirstDiagonal = 0;
        int onSecondDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j)
                    onFirstDiagonal += arr.get(i).get(j);

                if ((i + j) == (arr.size() - 1))
                    onSecondDiagonal += arr.get(i).get(j);
            }
        }

        return Math.abs(onFirstDiagonal - onSecondDiagonal);
    }

    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (long item : ar)
            sum += item;
        return sum;
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();

        int count_alice = 0;
        int count_bob = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i))
                count_alice++;
            if (a.get(i) < b.get(i))
                count_bob++;
        }

        result.add(count_alice);
        result.add(count_bob);

        return result;
    }

}

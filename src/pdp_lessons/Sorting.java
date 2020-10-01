package pdp_lessons;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {15, 25, 3, 82, 0, 47, 56};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] selectionSort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int holder = arr[i];
            arr[i] = arr[min];
            arr[min] = holder;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i - 1;

            while (previous >= 0 && current < arr[previous]) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = current;

        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int holder = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = holder;
                }
            }
        }
        return arr;
    }


}

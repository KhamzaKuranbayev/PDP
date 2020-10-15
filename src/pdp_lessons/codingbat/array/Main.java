package pdp_lessons.codingbat.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 8, 9, 3, 2, 1};
        System.out.println(maxMirror(nums));
    }

    public static int maxMirror(int[] nums) {
        int maxLength = 0;
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    if (count > 0) {
                        maxLength = Math.max(count, maxLength);
                        count = 0;
                    }
                }
            }
            maxLength = Math.max(count, maxLength);
        }
        return maxLength;
    }


    public static int maxSpan(int[] nums) {
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int a = nums.length;
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] != nums[j]) {
                    a--;
                } else {
                    break;
                }
            }
            int span = a - i;

            if (span > maxLength)
                maxLength = span;
        }
        return maxLength;
    }

    public static boolean modThree(int[] nums) {
        if (nums.length < 3)
            return false;

        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2 && nums[i] % 2 == nums[i + 2] % 2)
                return true;
        }

        return false;
    }

    public static boolean has12(int[] nums) {
        boolean found = false;

        for (int num : nums) {
            if (num == 1)
                found = true;

            if (found && num == 2)
                return true;
        }

        return false;
    }

    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7)
                return true;

            if (i <= nums.length - 3 && nums[i] == 7 && nums[i + 2] == 7)
                return true;
        }

        return false;
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i])
                count++;
        }

        return count;
    }

    public static boolean either24(int[] nums) {
        boolean b1 = false;
        boolean b2 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2)
                b1 = true;

            if (nums[i] == 4 && nums[i + 1] == 4)
                b2 = true;
        }

        return b1 != b2;
    }

    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val)
                return false;
        }

        return true;
    }

    public static int countClumps(int[] nums) {
        int count = 0;
        boolean notFound = true;
        for (int i = 0; i < nums.length; ) {
            boolean isInc = true;
            int temp = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    notFound = false;
                    break;
                }
                if (nums[i] == nums[j]) {
                    temp++;
                }

            }
            if (temp > 0) {
                count++;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] != nums[j]) {
                        i = j;
                        isInc = false;
                        break;
                    }
                }
            }
            if (isInc) {
                i++;
            }
        }
        if (notFound && count > 0) {
            return 1;
        }
        return count;
    }

    public static int[] seriesUp(int n) {
        int size = (n * (n + 1) / 2);
        int[] nums = new int[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j <= i + 1; j++) {
                nums[index] = j;
                if (index < size - 1)
                    index++;
            }
            if (index == size - 1)
                break;
        }
        return nums;
    }

    public static int[] squareUp(int n) {
        int index = 0;
        int[] square = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            for (int k = i + 1; k > 0; k--) {
                square[index] = k;
                if (index < (n * n - 1)) {
                    index++;
                }
            }
        }
        return square;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) return true;
        int count = 0;
        for (int k : inner) {
            for (int i : outer) {
                if (k == i) {
                    count++;
                    break;
                }
            }
        }

        return count == inner.length;
    }

    public static boolean canBalance(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum2 += nums[j];
            }
            if (sum1 == sum2)
                return true;

            sum2 = 0;
        }
        return false;
    }

    public static int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length - 1; ) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 5) {
                        int holder = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = holder;
                        break;
                    }
                }
                i = i + 2;
                continue;
            }
            if (nums[i] == 5) {
                boolean isContinue = false;
                if (i == 0 || nums[i - 1] != 4) {
                    isContinue = true;
                }

                if (isContinue) {
                    for (int j = i + 1; j < nums.length - 1; j++) {
                        if (nums[j] == 4 && nums[j + 1] != 5) {
                            int holder = nums[j + 1];
                            nums[j + 1] = nums[i];
                            nums[i] = holder;
                            break;
                        }
                    }
                }
            }
            i++;
        }
        return nums;
    }

    public static int[] fix34(int[] nums) {
        boolean isChange = false;
        for (int i = 0; i < nums.length - 1; ) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        int holder = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = holder;
                        isChange = true;
                        break;
                    }
                }
                if (isChange) {
                    i = i + 2;
                    continue;
                }
            }
            if (nums[i] == 4 && i > 0 && nums[i - 1] != 3) {

                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (nums[j] == 3 && nums[j + 1] != 4) {
                        int holder = nums[j + 1];
                        nums[j + 1] = nums[i];
                        nums[i] = holder;
                        break;
                    }
                }
            }
            i++;
        }
        return nums;
    }

    public static boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] - nums[i] == 1 && nums[i + 2] - nums[i + 1] == 1) {
                return true;
            }
        }
        return false;
    }

    public static int[] shiftLeft(int[] nums) {
        if (nums.length > 0) {
            int j = 0;
            int firstElement = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[j++] = nums[i];
                if (i == nums.length - 1)
                    nums[j] = firstElement;
            }
        }
        return nums;
    }

    public static int[] tenRun(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                int multi = nums[i] / 10;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 10 == 0) break;
                    nums[j] = multi * 10;
                }
            }
        }
        return nums;
    }

    public static int[] post4(int[] nums) {
        int count = 0;
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                j = i;
                break;
            }
            count++;
        }
        int[] n = new int[count];
        int k = 0;
        for (int i = j + 1; i < nums.length; i++) {
            n[k++] = nums[i];
        }
        return n;
    }

    public static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public static int[] zeroFront(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (Math.abs(arr[j]) > Math.abs(arr[j + 1])) {
                    int holder = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = holder;
                }
            }
        }
        return arr;
    }

    public static int[] withoutTen(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                nums[i] = 0;
                count++;
            }
        }
        if (count > 0) {
            int i = 0;
            for (int n : nums) {
                if (n != 0) {
                    nums[i++] = n;
                }
            }
            for (int j = 0; j < count; j++) {
                nums[i++] = 0;
            }
        }
        return nums;

    }

    public static int[] withoutTen2(int[] nums) {
        if (nums.length > 0) {
            int n;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 10) {
                    nums[i] = 0;
                }
                for (int j = 0; j < nums.length - 1 - i; j++) {
                    if (nums[j] == 0 && nums[j + 1] != 0) {
                        nums[j] = nums[j + 1];
                        nums[j + 1] = 0;
                    }
                }
            }
        }
        return nums;
    }

    public static int[] zeroMax(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > max && nums[j] % 2 == 1) {
                        max = nums[j];
                    }
                }
                nums[i] = max;
            }
        }
        return nums;
    }

    public static int[] evenOdd(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                }
            }
        }
        return nums;
    }

    public static String[] fizzBuzz(int start, int end) {
        String[] str = new String[end - start];
        int a = start;
        for (int i = 0; i < end - a; i++) {
            if (start % 3 == 0 && start % 5 == 0) {
                str[i] = "FizzBuzz";
            } else if (start % 3 == 0) {
                str[i] = "Fizz";
            } else if (start % 5 == 0) {
                str[i] = "Buzz";
            } else {
                str[i] = start + "";
            }
            start++;
        }
        return str;
    }

    public static boolean no14(int[] nums) {
        int b1 = 0;
        int b2 = 0;
        for (int n : nums) {
            if (n == 1) {
                b1 = 1;
            }
            if (n == 4) {
                b2 = 4;
            }
        }
        return b1 == 0 || b2 == 0;
    }
    //995020545

    public static boolean only14(int[] nums) {
        for (int n : nums) {
            if (n != 1 && n != 4) {
                return false;
            }
        }
        return true;
    }

    public static int centeredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return (sum - min - max) / (nums.length - 2);
    }

//    public static int[] fizzArray(int i, int n) {
//        int[] m = new int[n];
//        for (int i = 0; i < n; i++) {
//            m[i] = i;
//        }
//        return m;
//    }

    public static boolean more14(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        for (int num : nums) {
            if (num == 1) c1++;
            if (num == 4) c2++;
        }
        return c1 > c2;
    }

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2)
                sum += 2;
        }
        return sum == 8;
    }

    public static boolean lucky13(int[] nums) {
        for (int n : nums) {
            if (n == 1 || n == 3)
                return false;
        }
        return true;
    }

    public static int[] reverse(int[] numbers) {
        int[] numbers2 = new int[numbers.length];
        int i = numbers.length - 1;
        for (int number : numbers)
            numbers2[i--] = number;
        return numbers2;
    }

    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2)
                return true;
        }
        return false;
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        int signSix = -1;
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 6 && signSix == -1) {
                    signSix = i;
                }
                if (nums[i] == 7 && signSix != -1) {
                    for (int j = signSix; j < i; j++) {
                        sum -= nums[j];
                    }
                    signSix = -1;
                    continue;
                }
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; ) {
                if (nums[i] == 13) {
                    i = i + 2;
                    continue;
                }
                sum += nums[i];
                i++;
            }
        }
        return sum;
    }

    public static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int n : nums) {
            if (max < n)
                max = n;
            if (min > n)
                min = n;
        }
        return max - min;
    }

    public static int maxTriple(int[] nums) {
        int max = 0;
        if (nums.length >= 1) {
            max = Math.max(nums[0], nums[nums.length - 1]);
            max = Math.max(max, nums[nums.length / 2]);
        }
        return max;
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        int i = 0;
        for (int n : a)
            c[i++] = n;
        for (int n : b)
            c[i++] = n;

        return c;
    }

    public static int[] plusTwo2(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;

        for (int n : a) {
            if (n == 1) {
                count++;
                break;
            }
        }
        for (int n : b) {
            if (n == 1) {
                count++;
                break;
            }
        }
        return count;
    }

    public static int[] makeLast(int[] nums) {
        int[] newNums = new int[2 * nums.length];
        if (nums.length >= 1) {
            Arrays.fill(newNums, 0);
            newNums[newNums.length - 1] = nums[nums.length - 1];
        }
        return newNums;
    }

    public static int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        Arrays.fill(nums, max);
        return nums;
    }

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1)
            return nums[0] == nums[nums.length - 1];
        return false;
    }

    public static boolean unlucky1(int[] nums) {
        if (nums.length >= 2) {
            return (nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) ||
                    (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
        }
        return false;
    }

    public static int[] midThree(int[] nums) {
        int[] n = new int[3];
        if (nums.length >= 3) {
            n[0] = nums[nums.length / 2 - 1];
            n[1] = nums[nums.length / 2];
            n[2] = nums[nums.length / 2 + 1];
        }
        return n;
    }

    public static int[] makeMiddle(int[] nums) {
        int[] n = new int[2];
        if (nums.length >= 2) {
            n[0] = nums[nums.length / 2 - 1];
            n[1] = nums[nums.length / 2];
        }
        return n;
    }

    public static int[] fix23(int[] nums) {
        int j = 0;
        for (int i : nums) {
            if (j != 0) {
                if (i == 3 && nums[j - 1] == 2)
                    nums[j] = 0;
            }
            j++;
        }
        return nums;
    }

    public static boolean no23(int[] nums) {
        return (nums[0] != 2 && nums[1] != 3) && (nums[0] != 3 && nums[1] != 2);
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] c = new int[2];
        c[0] = a[1];
        c[1] = b[1];

        return c;
    }

    public static int[] reverse3(int[] nums) {
        int[] a = new int[nums.length];
        int j = nums.length - 1;
        for (int i : nums) {
            a[j--] = i;
        }
        return a;
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static boolean firstLast6(int[] nums) {
        if (nums.length >= 1) {
            return nums[0] == 6 || nums[nums.length - 1] == 6;
        }
        return false;
    }

}

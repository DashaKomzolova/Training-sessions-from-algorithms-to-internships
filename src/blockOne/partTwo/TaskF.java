package blockOne.partTwo;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int x : a) {

            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max2 = x;
            }

            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }
        }

        long prodMax = (long) max1 * max2;
        long prodMin = (long) min1 * min2;

        if (prodMax >= prodMin) {
            System.out.println(max2 + " " + max1);
        } else {
            System.out.println(min1 + " " + min2);
        }
    }
}

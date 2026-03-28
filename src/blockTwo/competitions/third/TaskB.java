package blockTwo.competitions.third;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        boolean[] badShifts = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int dangerousShift = (i - (arr[i] - 1) + n) % n;
            badShifts[dangerousShift] = true;
        }

        for (int shift = 0; shift < n; shift++) {
            if (!badShifts[shift]) {
                System.out.println(shift);
                return;
            }
        }

        System.out.println(-1);

    }
}
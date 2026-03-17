package blockOne.competitions.first;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] l = new int[n];
        int[] r = new int[n];
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int q = scanner.nextInt();
            long height = 0;

            for (int j = 0; j < n; j++) {
                if (q >= l[j] && q <= r[j]) {
                    if ((q - l[j]) % 2 == 0) {
                        height += x[j];
                    } else {
                        height -= x[j];
                    }
                }
            }
            System.out.println(height);
        }
    }
}
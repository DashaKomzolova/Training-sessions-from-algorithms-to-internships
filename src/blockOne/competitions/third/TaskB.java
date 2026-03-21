package blockOne.competitions.third;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        long ans = Long.MAX_VALUE;

        for (long r = 1; r <= 2 * Math.sqrt(n) + 10; r++) {

            if (n % r == 0) {
                long k = n / r;
                ans = Math.min(ans, Math.abs(r - k));
            }

            if (r % 2 == 0) {
                if ((n - r/2) % r == 0) {
                    long k = (n - r/2) / r;
                    if (k >= 1) {
                        ans = Math.min(ans, Math.abs(r - (k + 1)));
                    }
                }
            } else {
                if ((n - (r + 1)/2) % r == 0) {
                    long k = (n - (r + 1)/2) / r;
                    if (k >= 1) {
                        ans = Math.min(ans, Math.abs(r - (k + 1)));
                    }
                }
                if ((n - (r - 1)/2) % r == 0) {
                    long k = (n - (r - 1)/2) / r;
                    if (k >= 1) {
                        ans = Math.min(ans, Math.abs(r - (k + 1)));
                    }
                }
            }
        }

        System.out.println(ans);
    }
}

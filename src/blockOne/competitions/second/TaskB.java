package blockOne.competitions.second;

import java.util.Scanner;

public class TaskB {

    public static int func(long n, long m, long h, long w) {
        int ans = 0;
        while (n > h) {
            n = (n + 1) / 2;
            ans += 1;
        }
        while (m > w) {
            m = (m + 1) / 2;
            ans += 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long h = scanner.nextLong();
        long w = scanner.nextLong();

        if ((n <= h && m <= w) || (n <= w && m <= h)) {
            System.out.println(0);
        } else {

            int ans1 = func(n, m, h, w);
            int ans2 = func(m, n, h, w);

            System.out.println(Math.min(ans1, ans2));
        }
    }
}
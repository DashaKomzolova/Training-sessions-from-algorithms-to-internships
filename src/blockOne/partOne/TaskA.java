package blockOne.partOne;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();
        int V = scanner.nextInt();
        int Q = scanner.nextInt();
        int M = scanner.nextInt();

        if (P == Q) {
            if (V > M) {
                int ans = V + V + 1;
                System.out.println(ans);
            } else {
                int ans = M + M + 1;
                System.out.println(ans);
            }
        } else {
            if (Math.abs(Q - P) > M + V) {
                int ans = V + 1 + M + 1;
                ans = ans + V + M;
                System.out.println(ans);

            } else if (Math.abs(Q - P) == M + V) {
                int ans = V + 1 + M + 1;
                ans = ans + Math.abs(Q - P) - 1;
                System.out.println(ans);
            } else if (Math.abs(Q - P) < M + V) {
                int ans1 = V + V + 1;
                int ans2 = M + M + 1;
                int ans3 = V + 1 + M + 1;
                ans3 = ans3 + Math.abs(Q - P) - 1;
                int max = Math.max(Math.max(ans1, ans2), ans3);
                System.out.println(max);
            }
        }
    }
}

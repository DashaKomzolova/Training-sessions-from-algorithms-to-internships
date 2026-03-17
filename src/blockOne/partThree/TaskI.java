package blockOne.partThree;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        List<int[]> ans = new ArrayList<>();

        if (a > 0 && c > 0) {
            ans.add(new int[]{b + 1, d + 1});
        }
        if (b > 0 && d > 0) {
            ans.add(new int[]{a + 1, c + 1});
        }
        if (a > 0 && b > 0) {
            ans.add(new int[]{Math.max(a, b) + 1, 1});
        }
        if (c > 0 && d > 0) {
            ans.add(new int[]{1, Math.max(c, d) + 1});
        }

        int[] minPair = ans.get(0);
        int minSum = minPair[0] + minPair[1];

        for (int i = 1; i < ans.size(); i++) {
            int[] current = ans.get(i);
            int currentSum = current[0] + current[1];
            if (currentSum < minSum) {
                minSum = currentSum;
                minPair = current;
            }
        }

        System.out.println(minPair[0] + " " + minPair[1]);
    }
}

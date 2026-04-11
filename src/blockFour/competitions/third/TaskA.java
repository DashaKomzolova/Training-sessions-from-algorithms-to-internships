package blockFour.competitions.third;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] parts = line.split(" ");

        int n = Integer.parseInt(parts[0]);

        List<Integer> balls = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            balls.add(Integer.parseInt(parts[i]));
        }

        int totalRemoved = 0;

        while (true) {
            boolean removed = false;

            int start = 0;
            int maxLen = 0;
            int maxStart = 0;

            for (int i = 0; i < balls.size(); i++) {
                int j = i;
                while (j < balls.size() && balls.get(j).equals(balls.get(i))) {
                    j++;
                }
                int len = j - i;
                if (len >= 3 && len > maxLen) {
                    maxLen = len;
                    maxStart = i;
                }
                i = j - 1;
            }

            if (maxLen >= 3) {
                for (int i = 0; i < maxLen; i++) {
                    balls.remove(maxStart);
                }
                totalRemoved += maxLen;
                removed = true;
            }

            if (!removed) {
                break;
            }
        }

        System.out.println(totalRemoved);
    }
}
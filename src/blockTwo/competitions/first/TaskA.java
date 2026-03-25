package blockTwo.competitions.first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> scores = new HashMap<>();

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        int m = scanner.nextInt();
        scanner.nextLine();

        int prevA = 0;
        int prevB = 0;

        for (int i = 0; i < m; i++) {
            String line = scanner.nextLine();

            String[] parts = line.split(" ");
            String score = parts[0];
            String name = parts[1];

            String[] scoreParts = score.split(":");
            int ai = Integer.parseInt(scoreParts[0]);
            int bi = Integer.parseInt(scoreParts[1]);

            int currentScore = (bi - prevB) + (ai - prevA);
            prevB = bi;
            prevA = ai;

            scores.put(name, scores.getOrDefault(name, 0) + currentScore);
        }

        int ans = Integer.MIN_VALUE;
        String winner = "";
        for (String name : scores.keySet()) {
            if (scores.get(name) > ans) {
                ans = scores.get(name);
                winner = name;
            }
        }

        System.out.println(winner + " " + ans);
    }
}

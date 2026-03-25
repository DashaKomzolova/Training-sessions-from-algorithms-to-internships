package blockTwo.competitions.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskB {

    private static boolean canPair(String[] words, int k) {
        Map<String, Integer> prefixCount = new HashMap<>();

        for (String word : words) {
            String prefix;
            if (k == 0) {
                prefix = "";
            } else {
                prefix = word.substring(0, Math.min(k, word.length()));
            }

            prefixCount.put(prefix, prefixCount.getOrDefault(prefix, 0) + 1);
        }

        for (int count : prefixCount.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[n];
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
            maxLen = Math.max(maxLen, words[i].length());
        }

        int left = 0;
        int right = maxLen;
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (canPair(words, mid)) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
        scanner.close();
    }
}
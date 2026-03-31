package blockThree.competitions.first;

import java.util.HashMap;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int answer = 0;

        for (int right = 0; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > 2) {
                int leftType = arr[left];
                map.put(leftType, map.get(leftType) - 1);

                if (map.get(leftType) == 0) {
                    map.remove(leftType);
                }

                left++;
            }

            if (map.size() == 2) {
                answer = Math.max(answer, right - left + 1);
            }
        }

        System.out.println(answer);
    }
}

package blockTwo.trainings.partTwo;

import java.util.HashMap;
import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a + b + 1 == N && a >= 0 && b >= 0) {
                String key = a + "," + b;
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        int ans = 0;

        for (int count : map.values()) {
            ans += Math.min(count, 1);
        }

        System.out.println(ans);
    }
}

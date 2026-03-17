package blockOne.partThree;

import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] distances = new int[10];

        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                int tempDist = Integer.MAX_VALUE;
                for (int j = 0; j < 10; j++) {
                    if (arr[j] == 2) {
                        if (Math.abs(j - i) < tempDist) {
                            tempDist = Math.abs(j - i);
                        }
                    }
                }
                distances[i] = tempDist;
            }
        }

        int ans = 0;
        for (int i = 0; i < 10; i++) {
            if (distances[i] > ans) {
                ans = distances[i];
            }
        }

        System.out.println(ans);
    }
}

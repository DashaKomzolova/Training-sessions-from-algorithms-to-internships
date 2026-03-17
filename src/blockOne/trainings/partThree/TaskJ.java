package blockOne.trainings.partThree;

import java.util.*;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            ArrayList<int[]> arr = new ArrayList<>();
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int b2 = scanner.nextInt();
            int c1 = scanner.nextInt();
            int c2 = scanner.nextInt();
            int d1 = scanner.nextInt();
            int d2 = scanner.nextInt();

            arr.add(new int[]{a1, a2});
            arr.add(new int[]{b1, b2});
            arr.add(new int[]{c1, c2});
            arr.add(new int[]{d1, d2});

            boolean isParallelogram = false;

            if (arr.get(0)[0] + arr.get(1)[0] == arr.get(2)[0] + arr.get(3)[0] &&
                    arr.get(0)[1] + arr.get(1)[1] == arr.get(2)[1] + arr.get(3)[1]) {
                isParallelogram = true;
            }
            if (arr.get(0)[0] + arr.get(2)[0] == arr.get(1)[0] + arr.get(3)[0] &&
                    arr.get(0)[1] + arr.get(2)[1] == arr.get(1)[1] + arr.get(3)[1]) {
                isParallelogram = true;
            }
            if (arr.get(0)[0] + arr.get(3)[0] == arr.get(1)[0] + arr.get(2)[0] &&
                    arr.get(0)[1] + arr.get(3)[1] == arr.get(1)[1] + arr.get(2)[1]) {
                isParallelogram = true;
            }

            if (isParallelogram) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}

package blockFour.trainings.partFour;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<int[]> stack = new Stack<>();

        int N = scanner.nextInt();

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = -1;
        }

        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();

            if (stack.isEmpty()) {
                stack.push(new int[]{temp, i});
            } else {
                while (!stack.isEmpty() && stack.peek()[0] > temp) {
                    ans[stack.peek()[1]] = i;
                    stack.pop();
                }
                stack.push(new int[]{temp, i});
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

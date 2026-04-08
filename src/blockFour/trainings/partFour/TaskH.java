package blockFour.trainings.partFour;

import java.util.Scanner;
import java.util.Stack;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<int[]> stack = new Stack<>();

        int N = scanner.nextInt();
        int[] arr = new int[N];
        int[] smallestR = new int[N];
        int[] smallestL = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            smallestR[i] = N;
        }

        for (int i = 0; i < N; i++) {
            smallestL[i] = -1;
        }

        for (int i = 0; i < N; i++) {
            int temp = arr[i];

            while (!stack.isEmpty() && stack.peek()[0] > temp) {
                smallestR[stack.peek()[1]] = i;
                stack.pop();
            }
            stack.push(new int[]{temp, i});
        }

        stack.clear();

        for (int i = N - 1; i >= 0; i--) {
            int temp = arr[i];

            while (!stack.isEmpty() && stack.peek()[0] > temp) {
                smallestL[stack.peek()[1]] = i;
                stack.pop();
            }
            stack.push(new int[]{temp, i});
        }

        long maxArea = 0;
        for (int i = 0; i < N; i++) {
            int width = smallestR[i] - smallestL[i] - 1;
            long area = (long) arr[i] * width;
            if (area > maxArea) {
                maxArea = area;
            }
        }

        System.out.println(maxArea);
    }
}
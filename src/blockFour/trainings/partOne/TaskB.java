package blockFour.trainings.partOne;

import java.util.Stack;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        int number = 1;

        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();

            while (!stack.isEmpty() && stack.peek() == number) {
                number++;
                stack.pop();
            }

            if (temp == number) {
                number++;
            } else {
                stack.push(temp);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.pop() == number) {
                number++;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
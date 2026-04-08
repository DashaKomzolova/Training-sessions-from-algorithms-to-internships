package blockFour.trainings.partThree;

import java.util.Scanner;
import java.util.Stack;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        String line = scanner.nextLine();

        for (char c : line.toCharArray()) {
            if (c == '+') {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n1 + n2);
            } else if (c == '-') {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 - n1);
            } else if (c == '*') {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n1 * n2);
            } else if (c == ' ') {
                continue;
            } else {
                stack.push(Integer.parseInt(String.valueOf(c)));
            }
        }
        System.out.println(stack.pop());
    }
}

package blockFour.trainings.partTwo;

import java.util.Scanner;
import java.util.Stack;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String line = scanner.nextLine();

        if (line.isEmpty()) {
            System.out.println("yes");
            return;
        }

        for (Character c : line.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    System.out.println("no");
                    return;
                }
            } else if (c == '{') {
                stack.push(c);
            } else if (c == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    System.out.println("no");
                    return;
                }
            } else if (c == '[') {
                stack.push(c);
            } else if (c == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    System.out.println("no");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

package blockFour.competitions.second;

import java.util.Scanner;
import java.util.Stack;

public class TaskA {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (line.isEmpty()) {
            System.out.println("YES");
            return;
        }

        int n = line.length();

        for (int shift = 0; shift < n; shift++) {
            String cyclicShift = line.substring(shift) + line.substring(0, shift);
            if (isValid(cyclicShift)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
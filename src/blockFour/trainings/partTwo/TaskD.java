package blockFour.trainings.partTwo;

import java.util.*;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String w = scanner.nextLine();
        String s = scanner.nextLine();

        Map<Character, Character> closing = new HashMap<>();
        closing.put(']', '[');
        closing.put(')', '(');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (closing.containsKey(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        String ans = "";
        int remaining = n - s.length();

        for (int i = 0; i < remaining; i++) {
            for (char c : w.toCharArray()) {
                if (closing.containsKey(c)) {
                    if (!stack.isEmpty() && stack.peek() == closing.get(c)) {
                        if (remaining - i - 1 >= stack.size() - 1) {
                            ans += c;
                            stack.pop();
                            break;
                        }
                    }
                } else {
                    if (remaining - i - 1 >= stack.size() + 1) {
                        ans += c;
                        stack.push(c);
                        break;
                    }
                }
            }
        }
        System.out.println(s + ans);
    }
}
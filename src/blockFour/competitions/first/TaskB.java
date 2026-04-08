package blockFour.competitions.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();

        Map<Integer, StringBuilder> windows = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            windows.put(i, new StringBuilder());
        }

        int currentWindow = 1;
        String clipboard = "";

        for (int i = 0; i < M; i++) {
            String command = scanner.nextLine();

            if (command.equals("Next")) {
                currentWindow = currentWindow % N + 1;
            } else if (command.equals("Backspace")) {
                StringBuilder sb = windows.get(currentWindow);
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else if (command.equals("Copy")) {
                StringBuilder sb = windows.get(currentWindow);
                if (sb.length() <= K) {
                    clipboard = sb.toString();
                } else {
                    clipboard = sb.substring(sb.length() - K);
                }
            } else if (command.equals("Paste")) {
                StringBuilder sb = windows.get(currentWindow);
                sb.append(clipboard);
            } else {
                StringBuilder sb = windows.get(currentWindow);
                sb.append(command);
            }
        }

        StringBuilder fullContent = windows.get(currentWindow);
        if (fullContent.length() == 0) {
            System.out.println("Empty");
        } else if (fullContent.length() <= K) {
            System.out.println(fullContent.toString());
        } else {
            System.out.println(fullContent.substring(fullContent.length() - K));
        }
    }
}

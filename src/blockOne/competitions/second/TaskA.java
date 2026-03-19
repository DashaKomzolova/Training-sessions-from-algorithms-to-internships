package blockOne.competitions.second;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        int maxLen = 0;
        int curLen = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'a' && c != 'h') {
                curLen = 0;
            } else {
                if (curLen == 0) {
                    curLen = 1;
                } else {
                    char prev = str.charAt(i - 1);
                    if (c != prev) {
                        curLen++;
                    } else {
                        curLen = 1;
                    }
                }
                if (curLen > maxLen) {
                    maxLen = curLen;
                }
            }
        }

        System.out.println(maxLen);
    }
}
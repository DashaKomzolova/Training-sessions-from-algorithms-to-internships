package blockOne.competitions.first;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        int ans = 0;
        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            arr[i] = str.toCharArray();
        }

        for (int i = 0; i < n; i++) {
            char[] temp = arr[i];

            for (int j = 0; j < m - 1; j++) {
                if (temp[j] == '.' && temp[j + 1] == '.') {
                    ans++;
                }
            }

            if (i < n - 1) {
                char[] next = arr[i + 1];
                for (int j = 0; j < m; j++) {
                    if (temp[j] == '.' && next[j] == '.') {
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
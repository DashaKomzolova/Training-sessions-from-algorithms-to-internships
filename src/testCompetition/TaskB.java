package testCompetition;

import java.io.*;

public class TaskB {
    public static int[] solve(int n, int[] arr) {
        if (n == 1) return new int[]{1};
        long sum = arr[0];
        int firstWinner = n;
        int lastLoser = 0;
        for (int i = 1; i < n - 1; i++) {
            sum += arr[i];
            if (arr[i] > arr[i-1] && sum > arr[i+1]) {
                if (firstWinner == n) firstWinner = i;
            }
            if (sum <= arr[i+1]) {
                lastLoser = i;
            }
        }
        int winnerPos = Math.max(firstWinner, lastLoser + 1);
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = i < winnerPos ? 0 : 1;
        }

        if (n > 1 && arr[n-1] > arr[n-2]) {
            ans[n-1] = 1;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] parts = reader.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        int[] ans = solve(n, arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ans[i]).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}

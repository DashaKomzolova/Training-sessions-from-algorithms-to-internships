package blockThree.competitions.first;

import java.util.HashMap;
import java.util.Scanner;

public class TaskA {

    public static int[] prefixSum(String str) {
        int[] arr = new int[str.length() + 1];
        arr[0] = 0;

        int i = 1;

        for (Character c : str.toCharArray()) {
            if (c == 'a') {
                arr[i] = arr[i - 1] + 1;
            } else {
                arr[i] = arr[i - 1] - 1;
            }
            i++;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        int[] arr = prefixSum(str);

        long answer = 0;

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        for (int cnt : hashMap.values()) {
            answer += (long) cnt * (cnt - 1) / 2;
        }

        System.out.println(answer);
    }
}

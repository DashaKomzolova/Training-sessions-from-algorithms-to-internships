package blockThree.trainings.partOne;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA {

    public static int[] prefixSum(int n, int[] array) {
        int[] prefSum = new int[n + 1];
        prefSum[0] = 0;

        for (int i = 1; i < n + 1; i++) {
            prefSum[i] = prefSum[i - 1] + array[i - 1];
        }

        return prefSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] result = prefixSum(n, array);

        for (int i = 1; i < n + 1; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

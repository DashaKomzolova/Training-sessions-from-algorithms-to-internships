package blockThree.trainings.partOne;

import java.util.Scanner;

public class TaskC {

    public static long maxInPrefixSum(long[] array) {
        long answer = array[0];

        long minPrefSum = 0;
        long nowSum = 0;


        for (int i = 0; i < array.length; i++) {
            nowSum += array[i];
            answer = Math.max(answer, nowSum - minPrefSum);
            minPrefSum = Math.min(nowSum, minPrefSum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
        }


        System.out.println(maxInPrefixSum(array));
    }
}

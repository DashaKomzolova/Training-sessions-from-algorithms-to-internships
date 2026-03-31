package blockThree.trainings.partOne;

import java.util.HashMap;
import java.util.Scanner;

public class TaskD {

    public static int numberOfSumCars(int k, int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        cnt.put(0, 1);

        int nowSum = 0;

        for (int el : array) {
            nowSum += el;

            if (cnt.containsKey(nowSum - k)) {
                answer += cnt.get(nowSum - k);
            }

            cnt.put(nowSum, cnt.getOrDefault(nowSum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(numberOfSumCars(k ,array));
    }
}

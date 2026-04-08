package blockFour.trainings.partFive;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();

            if (deque.isEmpty()) {
                deque.addLast(temp);
                continue;
            }

            if (cnt != K) {
                cnt += 1;
                if (deque.getLast() < temp) {
                    deque.addLast(temp);
                } else {
                    while (!deque.isEmpty() && deque.getLast() > temp) {
                        deque.removeLast();
                    }
                    deque.addLast(temp);
                }
            } else {
                cnt = 0;
                System.out.println(deque.getFirst());
                deque.removeFirst();
                if (deque.getLast() < temp) {
                    deque.addLast(temp);
                } else {
                    while (!deque.isEmpty() && deque.getLast() > temp) {
                        deque.removeLast();
                    }
                    deque.addLast(temp);
                }
            }
        }
    }
}

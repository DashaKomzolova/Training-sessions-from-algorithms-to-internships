package blockTwo.trainings.partThree;

import java.util.HashMap;
import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> hashMap = new HashMap<>();

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String key = scanner.next();
            String value = scanner.next();

            hashMap.put(key, value);
        }

        String word = scanner.next();

        for (String e : hashMap.keySet()) {
            if (e.equals(word)) {
                if (e != null) {
                    System.out.println(hashMap.get(e));
                }
            }
        }

        for (String key : hashMap.keySet()) {
            Object obj = hashMap.get(key);
            if (key != null) {
                if (word.equals(obj)) {
                    System.out.println(key);
                }
            }
        }

    }
}

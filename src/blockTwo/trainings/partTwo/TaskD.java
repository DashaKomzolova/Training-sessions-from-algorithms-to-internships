package blockTwo.trainings.partTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> hashMap = new HashMap<>();

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int M = scanner.nextInt();
            for (int j = 0; j < M; j++) {
                String language = scanner.next();
                if (!hashMap.containsKey(language)) {
                    hashMap.put(language, 1);
                } else {
                    hashMap.replace(language, hashMap.get(language) + 1);
                }

            }
        }

        int cntOnlyOneLanguage = 0;
        ArrayList<String> oneLanguage = new ArrayList<>();

        for (String el : hashMap.keySet()) {
            if (hashMap.get(el) == N) {
                cntOnlyOneLanguage += 1;
                oneLanguage.add(el);
            }
        }

        System.out.println(cntOnlyOneLanguage);
        for (String e : oneLanguage) {
            System.out.println(e);
        }

        int cnt = 0;
        ArrayList<String> second = new ArrayList<>();

        for (String el : hashMap.keySet()) {
            if (hashMap.get(el) > 0) {
                cnt += 1;
                second.add(el);
            }
        }

        System.out.println(cnt);
        for (String e : second) {
            System.out.println(e);
        }
    }
}

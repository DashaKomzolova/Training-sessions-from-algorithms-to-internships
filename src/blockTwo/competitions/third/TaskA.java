package blockTwo.competitions.third;

import java.util.HashMap;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int totalSum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hashMap.containsKey(ch)) {
                hashMap.replace(ch, hashMap.get(ch), hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
            totalSum += Character.getNumericValue(ch);
        }

        int remainder = totalSum % 3;

        if (remainder != 0) {
            boolean removed = false;

            for (int digit = remainder; digit <= 9; digit += 3) {
                char key = (char) (digit + '0');
                if (hashMap.containsKey(key) && hashMap.get(key) > 0) {
                    hashMap.replace(key, hashMap.get(key), hashMap.get(key) - 1);
                    removed = true;
                    break;
                }
            }

            if (!removed) {
                int targetRemainder = 3 - remainder;
                int countToRemove = 2;
                for (int digit = targetRemainder; digit <= 9 && countToRemove > 0; digit += 3) {
                    char key = (char) (digit + '0');
                    if (hashMap.containsKey(key) && hashMap.get(key) > 0) {
                        int canRemove = Math.min(hashMap.get(key), countToRemove);
                        hashMap.replace(key, hashMap.get(key), hashMap.get(key) - canRemove);
                        countToRemove -= canRemove;
                    }
                }
            }
        }

        String result = "";

        for (int digit = 9; digit >= 0; digit--) {
            char key = (char) (digit + '0');
            if (hashMap.containsKey(key) && hashMap.get(key) > 0) {
                for (int i = 0; i < hashMap.get(key); i++) {
                    result = result + key;
                }
            }
        }

        System.out.println(result);

    }
}
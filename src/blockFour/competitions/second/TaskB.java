package blockFour.competitions.second;

import java.util.Scanner;
import java.util.ArrayList;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String answers = scanner.nextLine();

        int m = scanner.nextInt();
        scanner.nextLine();

        String[] students = new String[m];
        for (int i = 0; i < m; i++) {
            students[i] = scanner.nextLine();
        }

        int[] correctCount = new int[m];
        int[] incorrectCount = new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (students[i].charAt(j) == answers.charAt(j)) {
                    correctCount[i]++;
                } else {
                    incorrectCount[i]++;
                }
            }
        }

        ArrayList<String> pairs = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                int correctMatch = 0;
                int incorrectMatch = 0;

                for (int k = 0; k < n; k++) {
                    char studentA = students[i].charAt(k);
                    char studentB = students[j].charAt(k);
                    char correct = answers.charAt(k);

                    if (studentA == correct && studentB == correct) {
                        correctMatch++;
                    } else if (studentA != correct && studentB != correct && studentA == studentB) {
                        incorrectMatch++;
                    }
                }

                if (correctMatch * 2 > correctCount[i] && correctMatch * 2 > correctCount[j] &&
                        incorrectMatch * 2 > incorrectCount[i] && incorrectMatch * 2 > incorrectCount[j]) {
                    pairs.add((i + 1) + " " + (j + 1));
                }
            }
        }

        System.out.println(pairs.size());
        for (String pair : pairs) {
            System.out.println(pair);
        }
    }
}

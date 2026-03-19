package blockTwo.trainings.partOne;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new HashSet<>();

        String str = scanner.nextLine();
        String[] arr = str.split(" ");

        for (String e : arr) {
            if (!set.contains(e)) {
                System.out.println("NO");
                set.add(e);
            } else {
                System.out.println("YES");
            }
        }
    }
}

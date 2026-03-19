package blockTwo.trainings.partOne;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new HashSet<>();

        String str = scanner.nextLine();
        String[] arr = str.split(" ");

        set.addAll(Arrays.asList(arr));

        System.out.println(set.size());
    }
}

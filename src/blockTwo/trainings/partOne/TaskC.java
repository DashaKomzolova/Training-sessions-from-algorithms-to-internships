package blockTwo.trainings.partOne;

import java.io.*;
import java.util.*;

public class TaskC {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("input.txt"));

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();

        Set<Integer> set = new HashSet<>();
        for (String num : str1.split(" ")) {
            set.add(Integer.parseInt(num));
        }

        TreeSet<Integer> result = new TreeSet<>();
        for (String num : str2.split(" ")) {
            int n = Integer.parseInt(num);
            if (set.contains(n)) {
                result.add(n);
            }
        }

        PrintWriter writer = new PrintWriter("output.txt");

        boolean first = true;
        for (int num : result) {
            if (!first) {
                writer.print(" ");
            }
            writer.print(num);
            first = false;
        }

        writer.close();
    }
}

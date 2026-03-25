package blockTwo.trainings.partThree;

import java.util.*;

public class TaskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, TreeMap<String, Integer>> treeMap = new TreeMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            // Пропускаем пустые строки
            if (line.trim().isEmpty()) {
                continue;
            }

            String[] arr = line.split(" ");

            // Проверяем, что получили 3 элемента
            if (arr.length < 3) {
                continue;
            }

            String name = arr[0];
            String product = arr[1];
            int quantity = Integer.parseInt(arr[2]);

            if (!treeMap.containsKey(name)) {
                TreeMap<String, Integer> temp = new TreeMap<>();
                temp.put(product, quantity);
                treeMap.put(name, temp);
            } else {
                TreeMap<String, Integer> temp = treeMap.get(name);
                if (!temp.containsKey(product)) {
                    temp.put(product, quantity);
                } else {
                    temp.put(product, temp.get(product) + quantity);
                }
            }
        }

        for (String person : treeMap.keySet()) {
            TreeMap<String, Integer> temp = treeMap.get(person);
            System.out.println(person + ":");
            for (String e : temp.keySet()) {
                System.out.println(e + " " + temp.get(e));
            }
        }

        scanner.close();
    }
}
package blockFour.competitions.third;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] field = new char[10][10];

        for (int i = 0; i < 10; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 10; j++) {
                field[i][j] = line.charAt(j);
            }
        }

        Map<Integer, Integer> ships = new HashMap<>();
        ships.put(1, 0);
        ships.put(2, 0);
        ships.put(3, 0);
        ships.put(4, 0);

        boolean[][] visited = new boolean[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (field[i][j] == '#' && !visited[i][j]) {

                    int width = 0;
                    int height = 0;

                    int k = j;
                    while (k < 10 && field[i][k] == '#') {
                        width++;
                        k++;
                    }

                    k = i;
                    while (k < 10 && field[k][j] == '#') {
                        height++;
                        k++;
                    }

                    if (width > 1 && height > 1) {
                        System.out.println("NO");
                        return;
                    }

                    int shipSize = Math.max(width, height);

                    if (shipSize < 1 || shipSize > 4) {
                        System.out.println("NO");
                        return;
                    }

                    for (int x = i; x < i + height; x++) {
                        for (int y = j; y < j + width; y++) {
                            if (x >= 10 || y >= 10 || field[x][y] != '#') {
                                System.out.println("NO");
                                return;
                            }
                            visited[x][y] = true;
                        }
                    }

                    for (int x = i - 1; x <= i + height; x++) {
                        for (int y = j - 1; y <= j + width; y++) {
                            if (x >= 0 && x < 10 && y >= 0 && y < 10) {
                                if ((x < i || x >= i + height || y < j || y >= j + width) && field[x][y] == '#') {
                                    System.out.println("NO");
                                    return;
                                }
                            }
                        }
                    }

                    ships.put(shipSize, ships.get(shipSize) + 1);
                }
            }
        }

        if (ships.get(1) == 4 && ships.get(2) == 3 && ships.get(3) == 2 && ships.get(4) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
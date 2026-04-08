package blockFour.competitions.first;

import java.util.Scanner;

public class TaskA {
    public  static int sizeOfBacteria(char[][] arr, int top, int left, int N, int M) {

        int width = 0;
        while (left + width < M && arr[top][left + width] == '#') {
            width++;
        }

        return width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        char[][] arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextLine().toCharArray();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == '#') {
                    int size = sizeOfBacteria(arr, i, j, N, M);
                    count++;
                    for (int x = 0; x < size; x++) {
                        for (int y = 0; y < size; y++) {
                            arr[i + x][j + y] = '.';
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}

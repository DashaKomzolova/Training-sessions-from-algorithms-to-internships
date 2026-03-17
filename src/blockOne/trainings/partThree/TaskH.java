package blockOne.trainings.partThree;

import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c < 0) {
            System.out.println("NO SOLUTION");
        } else {
            if (a == 0) {
                if (c * c - b == 0) {
                    System.out.println("MANY SOLUTIONS");
                } else {
                    System.out.println("NO SOLUTION");
                }
            } else {
                int x = c * c - b;
                if (x % a == 0) {
                    System.out.println(x / a);
                } else {
                    System.out.println("NO SOLUTION");
                }
            }
        }
    }
}

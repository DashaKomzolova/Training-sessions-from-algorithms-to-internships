package blockOne.trainings.partTwo;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tRoom = scanner.nextInt();
        int tCond = scanner.nextInt();
        String mode = scanner.next();

        if (mode.equals("freeze")) {
            if (tCond < tRoom) {
                System.out.println(tCond);
            } else {
                System.out.println(tRoom);
            }
        } else if (mode.equals("heat")) {
            if (tCond > tRoom) {
                System.out.println(tCond);
            } else {
                System.out.println(tRoom);
            }
        } else if (mode.equals("auto")) {
            System.out.println(tCond);
        } else {
            System.out.println(tRoom);
        }
    }
}

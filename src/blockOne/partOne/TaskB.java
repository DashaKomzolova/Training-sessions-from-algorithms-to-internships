package blockOne.partOne;

import java.util.Scanner;

public class TaskB {

    public static int[] getEntranceAndFloor(int flatNo, int flatsOnFloor, int floors) {
        int floorsBefore = (flatNo - 1) / flatsOnFloor; // Сколько лестничных площадок прошло до нашей квартиры
        int entrance = floorsBefore / floors + 1; // В каком подъезде эта площадка
        int floor = floorsBefore % floors + 1; // Какой этаж в этом подъезде
        return new int[]{entrance, floor};
    }

    public static int[] check(int k1, int m, int k2, int p2, int n2, int flatsOnFloor) {
        int[] ans = getEntranceAndFloor(k2, flatsOnFloor, m);
        int entrance2 = ans[0];
        int floor2 = ans[1];
        if (entrance2 == p2 && floor2 == n2) {
            return getEntranceAndFloor(k1, flatsOnFloor, m);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int m = scanner.nextInt();
        int k2 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int ent = -1;
        int floor = -1;
        boolean good_flag = false;

        for (int i = 1; i < Math.pow(10, 6) + 1; i++) {
            int[] ans = check(k1, m, k2, p2, n2, i);
            int nEnt = ans[0];
            int nFloor = ans[1];

            if (nEnt != -1) {
                good_flag = true;
                if (ent == -1) {
                    ent = nEnt;
                    floor = nFloor;
                } else if (ent != nEnt && ent != 0) {
                    ent = 0;
                } else if (floor != nFloor && floor != 0) {
                    floor = 0;
                }
            }
        }

        if (good_flag) {
            System.out.println(ent + " " + floor);
        } else {
            System.out.println(-1 + " " + -1);
        }

    }
}

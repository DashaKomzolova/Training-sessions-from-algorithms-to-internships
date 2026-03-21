package blockOne.competitions.third;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String[] arrOfWords = str.split(" ");

        ArrayList<String> ans = new ArrayList<>();

        for (String e : arrOfWords) {
            int begin = 0;
            int end = 0;

            while (begin < e.length() && e.charAt(begin) == '\'') {
                begin++;
            }

            int lastIndex = e.length() - 1;
            while (lastIndex >= 0 && e.charAt(lastIndex) == '\'') {
                end++;
                lastIndex--;
            }

            String temp = e.substring(begin + begin, e.length() - end - end);
            ans.add(temp);
        }

        for (String s : ans) {
            System.out.print(s);
        }
    }
}
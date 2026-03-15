import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[] output = new char[input.length()];
        int cnt = 0;
        int i = 0;

        while (i < input.length()) {

            if (i + 2 < input.length() && input.charAt(i + 2) == '#') {
                int code = Integer.parseInt(input.substring(i, i + 2)); // 10..26
                output[cnt] = (char) (code + 96);
                cnt++;
                i += 3;
            } else {
                int code = Integer.parseInt(input.substring(i, i + 1)); // 1..9
                output[cnt] = (char) (code + 96);
                cnt++;
                i += 1;
            }
        }


        for (int j = 0; j < cnt; j++) {
            System.out.print(output[j]);
        }
    }
}

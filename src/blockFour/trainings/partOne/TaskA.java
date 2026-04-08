package blockFour.trainings.partOne;

import java.util.Scanner;
import java.util.Stack;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] array = line.split(" ");

            if (array[0].equals("push")) {
                stack.push(Integer.parseInt(array[1]));
                System.out.println("ok");
            } else if (array[0].equals("pop")) {
                if (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                } else {
                    System.out.println("error");
                }
            } else if (array[0].equals("back")) {
                if (!stack.isEmpty()) {
                    System.out.println(stack.peek());
                } else {
                    System.out.println("error");
                }
            } else if (array[0].equals("size")) {
                System.out.println(stack.size());
            } else if (array[0].equals("clear")) {
                stack.clear();
                System.out.println("ok");
            } else if (array[0].equals("exit")) {
                System.out.println("bye");
                return;
            }
        }
    }
}

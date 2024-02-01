import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class test1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(stack::push);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
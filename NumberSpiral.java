import java.util.Arrays;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();
        scanner.nextLine();

        int[][] tests = new int[numTests][2];
        for (int i = 0; i < numTests; i++) {
            int[] currentTest = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            tests[i] = currentTest;
        }

        for (int[] test : tests) {
            int y = test[0];
            int x = test[1];
            if (y >= x) {
                if (y % 2 == 0) {
                    System.out.println((int) (Math.pow(y, 2)) - (x - 1));
                } else {
                    System.out.println((int) (Math.pow(y - 1, 2)) + (y - x) + 1);
                }
            } else {
                if (x % 2 == 0) {
                    System.out.println((int) (Math.pow(x - 1, 2)) + (x - y) + 1);
                } else {
                    System.out.println((int) (Math.pow(x, 2)) - (y - 1));
                }
            }
        }
    }
}
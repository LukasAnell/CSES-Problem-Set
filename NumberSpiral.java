import java.util.Arrays;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();
        scanner.nextLine();

        long[][] tests = new long[numTests][2];
        for (int i = 0; i < numTests; i++) {
            long[] currentTest = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToLong(Long::parseLong)
                    .toArray();
            tests[i] = currentTest;
        }

        for (long[] test : tests) {
            long y = test[0];
            long x = test[1];
            if (y >= x) {
                if (y % 2 == 0) {
                    System.out.println((long) (Math.pow(y, 2)) - (x - 1));
                } else {
                    System.out.println((long) (Math.pow(y - 1, 2)) + (y - x) + 1);
                }
            } else {
                if (x % 2 == 0) {
                    System.out.println((long) (Math.pow(x - 1, 2)) + (x - y) + 1);
                } else {
                    System.out.println((long) (Math.pow(x, 2)) - (y - 1));
                }
            }
        }
    }
}
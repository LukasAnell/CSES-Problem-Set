import java.util.Arrays;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();
        scanner.nextLine();

        String[] tests = new String[numTests];
        for (int i = 0; i < numTests; i++) {
            tests[i] = scanner.nextLine();
        }

        for (String test : tests) {
            String[] coordinates = test.split("\\s+");

            long y = Integer.parseInt(coordinates[0]);
            long x = Integer.parseInt(coordinates[1]);

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
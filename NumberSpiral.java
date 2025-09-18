import java.util.Arrays;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();
        scanner.nextLine();

        long[] output = new long[numTests];
        for (int i = 0; i < numTests; i++) {
            String[] coordinates = scanner.nextLine().split("\\s+");

            long y = Long.parseLong(coordinates[0]);
            long x = Long.parseLong(coordinates[1]);

            if (y >= x) {
                if (y % 2 == 0) {
                    output[i] = (long) (Math.pow(y, 2)) - (x - 1);
                } else {
                    output[i] = (long) (Math.pow(y - 1, 2)) + (y - x) + 1;
                }
            } else {
                if (x % 2 == 0) {
                    output[i] = (long) (Math.pow(x - 1, 2)) + (x - y) + 1;
                } else {
                    output[i] = (long) (Math.pow(x, 2)) - (y - 1);
                }
            }
        }

        for (long line : output) {
            System.out.println(line);
        }
    }
}
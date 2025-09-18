import java.util.Arrays;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();
        scanner.nextLine();

        long[] output = new long[numTests];
        for (int i = 0; i < numTests; i++) {
            String test = scanner.nextLine();
            int spaceIndex = test.indexOf(" ");

            long y = Long.parseLong(test.substring(0, spaceIndex));
            long x = Long.parseLong(test.substring(spaceIndex + 1));

            if (y >= x) {
                if (y % 2 == 0) {
                    output[i] = y * y - (x - 1);
                } else {
                    output[i] = (y - 1) * (y - 1) + (y - x) + 1;
                }
            } else {
                if (x % 2 == 0) {
                    output[i] = (x - 1) * (x - 1) + (x - y) + 1;
                } else {
                    output[i] = x * x - (y - 1);
                }
            }
        }

        for (long line : output) {
            System.out.println(line);
        }
    }
}
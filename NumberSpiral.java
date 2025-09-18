import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();
        scanner.nextLine();

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < numTests; i++) {
            String test = scanner.nextLine();
            int spaceIndex = test.indexOf(" ");

            long y = Long.parseLong(test.substring(0, spaceIndex));
            long x = Long.parseLong(test.substring(spaceIndex + 1));

            long n = Math.max(x, y);
            long base = (n - 1) * (n - 1);

            if (n % 2 == 0) {
                if (x == n) {
                    output.append(n * n - y + 1);
                } else {
                    output.append(base + x);
                }
            } else {
                if (y == n) {
                    output.append(n * n - x + 1);
                } else {
                    output.append(base + y);
                }
            }

            output.append("\n");
        }

        System.out.println(output);
    }
}
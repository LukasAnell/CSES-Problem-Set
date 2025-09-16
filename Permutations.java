import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n <= 3) {
            if (n == 1) {
                System.out.println(n);
                return;
            }
            System.out.println("NO SOLUTION");
            return;
        }

        int[] evens = new int[n / 2];
        int[] odds;

        if (n % 2 != 0) {
            odds = new int[n / 2 + 1];
        } else {
            odds = new int[n / 2];
        }

        int evenPointer = 0;
        int oddPointer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evens[evenPointer] = i;
                evenPointer++;
            } else {
                odds[odds.length - 1 - oddPointer] = i;
                oddPointer++;
            }
        }

        int[] combined = IntStream.concat(IntStream.of(evens), IntStream.of(odds)).toArray();
        System.out.println(Arrays.toString(combined));
    }
}
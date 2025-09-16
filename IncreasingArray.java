import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextInt();
        scanner.nextLine();
        String arrayContents = scanner.nextLine();

        long[] array = Arrays.stream(arrayContents.split("\\s+"))
                .mapToLong(Long::parseLong)
                .toArray();

        long numMoves = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                long difference = array[i - 1] - array[i];
                array[i] += difference;
                numMoves += difference;
            }
        }

        System.out.println(numMoves);
    }
}
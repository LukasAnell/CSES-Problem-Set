import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine();
        String arrayContents = scanner.nextLine();

        int[] array = Arrays.stream(arrayContents.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int numMoves = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                int difference = array[i - 1] - array[i];
                array[i] += difference;
                numMoves += difference;
            }
        }

        System.out.println(numMoves);
    }
}
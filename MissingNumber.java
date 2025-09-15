import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();
        scanner.nextLine();
        String numList = scanner.nextLine();
        // n*(n-1) / 2
        long sumNums = Arrays.stream(numList.split("\\s+"))
                .mapToLong(Long::parseLong)
                .sum();
        long output = n * (n - 1) / 2 - sumNums;
        System.out.println(output);
    }
}
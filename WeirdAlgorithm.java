import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long startingNum = scanner.nextLong();
        while (startingNum >= 2) {
            System.out.printf("%d ", startingNum);

            if (startingNum % 2 == 0) {
                startingNum /= 2;
            } else {
                startingNum = startingNum * 3 + 1;
            }
        }

        System.out.print(1);
    }
}
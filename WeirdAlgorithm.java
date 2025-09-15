import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingNum = scanner.nextInt();
        int currentNum = startingNum;
        while (currentNum >= 2) {
            System.out.printf("%d ", currentNum);

            if (currentNum % 2 == 0) {
                currentNum /= 2;
            } else {
                currentNum = currentNum * 3 + 1;
            }
        }

        System.out.print(1);
    }
}
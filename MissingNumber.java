import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();
        scanner.nextLine();
        String numList = scanner.nextLine();

        for (long i = 1; i <= n; i++) {
            if (!numList.contains(Long.toString(i))) {
                System.out.print(i);
                break;
            }
        }
    }
}
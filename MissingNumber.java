import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String numList = scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            if (!numList.contains(Integer.toString(i))) {
                System.out.print(i);
                break;
            }
        }
    }
}
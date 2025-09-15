import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sequence = scanner.nextLine();

        int maxRunLength = Integer.MIN_VALUE;
        for (int i = 0; i < sequence.length(); i++) {
            int runLength = 0;
            boolean reachedEnd = false;
            for (int j = i; j < sequence.length(); j++) {
                if (sequence.charAt(i) != sequence.charAt(j)) {
                    break;
                }
                if (j == sequence.length() - 1) {
                    reachedEnd = true;
                }
                runLength++;
            }
            maxRunLength = Math.max(maxRunLength, runLength);
            if (reachedEnd) {
                break;
            }
        }
        System.out.println(maxRunLength);
    }
}
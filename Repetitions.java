import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sequence = scanner.nextLine();

        int maxRunLength = Integer.MIN_VALUE;
        for (int i = 0; i < sequence.length(); i++) {
            int runLength = 0;
            for (int j = 0; j < sequence.length(); j++) {
                if (sequence.charAt(i) != sequence.charAt(j)) {
                    break;
                }
                runLength++;
            }
            maxRunLength = Math.max(maxRunLength, runLength);
        }
        System.out.println(maxRunLength);
    }
}
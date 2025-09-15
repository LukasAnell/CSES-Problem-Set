import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sequence = scanner.nextLine();

        int maxRunLength = Integer.MIN_VALUE;

        Map<Character, Integer> frequencyMap = sequence.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(
                        Function.identity(),
                        c -> 1,
                        Integer::sum)
                );
        if (frequencyMap.size() <= 1) {
            System.out.println(Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getValue());
            return;
        }

        if (sequence.length() - sequence.replace(sequence.substring(0, 1), "").length() == sequence.length() - 1) {
            System.out.println(sequence.length());
            return;
        }

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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sequence = scanner.nextLine();

        Map<Character, Integer> maxRunLengths = new HashMap<>();
        maxRunLengths.put('A', 0);
        maxRunLengths.put('C', 0);
        maxRunLengths.put('G', 0);
        maxRunLengths.put('T', 0);

        int start = 0;
        for (int i = 0; i < sequence.length() - 1; i++) {
            char startChar = sequence.charAt(start);
            if (sequence.charAt(i + 1) != startChar) {
                maxRunLengths.put(startChar, Math.max(maxRunLengths.get(startChar), i - start));
                start = i + 1;
            }
        }
        System.out.println(Collections.max(maxRunLengths.entrySet(), Map.Entry.comparingByValue()).getValue());
    }
}
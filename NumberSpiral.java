import java.math.BigInteger;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTests = scanner.nextInt();
        scanner.nextLine();

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < numTests; i++) {
            String test = scanner.nextLine();
            int spaceIndex = test.indexOf(" ");

            BigInteger y = new BigInteger(test.substring(0, spaceIndex));
            BigInteger x = new BigInteger(test.substring(spaceIndex + 1));

            BigInteger n = y.max(x);
            BigInteger base = n.subtract(BigInteger.ONE).multiply(n.subtract(BigInteger.ONE));

            if (n.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                if (x.equals(n)) {
                    output.append(n.multiply(n).subtract(y).add(BigInteger.ONE));
                } else {
                    output.append(base.add(x));
                }
            } else {
                if (y.equals(n)) {
                    output.append(n.multiply(n).subtract(x).add(BigInteger.ONE));
                } else {
                    output.append(base.add(y));
                }
            }

            output.append("\n");
        }

        System.out.println(output);
    }
}
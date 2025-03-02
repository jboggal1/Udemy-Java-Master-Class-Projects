import java.util.*;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        double min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int count = 0;
        boolean validity = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number: ");
            String num = scanner.nextLine();
            try {
                double number = Double.parseDouble(num);
                min = Math.min(number, min);
                max = Math.max(number, max);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Value.");
                validity = false;
            }
        } while (validity);
        if (count > 0) {
            System.out.println("The minimum number entered: " + min);
            System.out.println("The maximum number entered: " + max);
        } else {
            System.out.println("No Valid Data Entered to compute min and max values.");
        }
    }
}

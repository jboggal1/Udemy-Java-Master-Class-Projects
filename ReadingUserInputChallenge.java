import java.util.*;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int count = 1;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number #" + count + ":");
            String num = scanner.nextLine();
            try {
                double number = Double.parseDouble(num);
                sum += number;
                count++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number");
            }
        } while (count < 6);

        System.out.println("The sum of the 5 numbers is " + sum);
    }
}

import java.util.*;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2025;
        String usersDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
        System.out.println("Parasing Integer Value");
        System.out.println("The user has an age of = " + (currentYear - dateOfBirth));

        String partialAge = "22.5";
        double partialAgeYear = Double.parseDouble(partialAge);
        System.out.println("\nParasing Double Value");
        System.out.println("The user has an age of " + partialAgeYear);

        /*
         * try {
         * System.out.println(getInputFromConsole(currentYear));
         * } catch (NullPointerException e) {
         * System.out.println(getInputFromScanner(currentYear));
         * }
         */

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {
        System.out.println("\n\nReading input with System.console():");
        String name = System.console().readLine("Hi, What's your name?");

        System.out.println("Hello, " + name + " nice to meet you.");

        String dateOfBirth = System.console().readLine("What year were you born?");

        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So " + name + ", you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nReading Input with Scanner.");
        System.out.println("Hi, What's your name?");
        String name = scanner.nextLine();

        System.out.println("What year were you born in?");
        boolean validYOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));

            try {
                age = checkData(currentYear, scanner.nextLine());
                validYOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed!!! Try again.");
            }

        } while (!validYOB);
        return "So " + name + " , you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String year) {
        int yearOfBirth = Integer.parseInt(year);
        int minimumYear = currentYear - 125;

        if ((yearOfBirth < minimumYear) || (yearOfBirth > currentYear)) {
            return -1;
        }
        return currentYear - yearOfBirth;
    }
}

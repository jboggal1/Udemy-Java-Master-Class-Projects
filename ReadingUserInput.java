public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = 2025;
        String usersDateOfBirth = "1996";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

        String partialAge = "22.5";
        double partialAgeYear = Double.parseDouble(partialAge);
        System.out.println("The user has a age of " + partialAgeYear);

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name?");

        System.out.println("Hello, " + name + " nice to meet you.");

        String dateOfBirth = System.console().readLine("What year were you born?");

        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So " + name + ", you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear) {
        return "";
    }
}

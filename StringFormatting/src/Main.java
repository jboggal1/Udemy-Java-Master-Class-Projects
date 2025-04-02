public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List: \n" +
                "\t *First Point\n" +
                "\t *Second Point\n" +
                "\t\t ->Sub Point\n" +
                "\t *Third Point";
        System.err.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    *First Point
                    *Second Point
                        ->Sub Point
                    *Third Point
                """;
        System.err.println(textBlock);
        int age = 35;
        System.out.printf("Your age is %d.%n", age);
        int yearOfBirth = 2025 - age;
        System.out.printf("Your age is %d, so your year of birth is %d.\n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d%n", i);
        }

        String formattedString = String.format("Your age is %d.", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d.".formatted(age);
        System.out.println(formattedString);

    }
}

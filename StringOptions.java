public class StringOptions {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append(("a".repeat(17)));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append(("a".repeat(17)));
        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builder = new StringBuilder("Hello" + " World");
        builder.append(" and Goodbye.");
        builder.deleteCharAt(16).insert(16, 'g');
        System.out.println(builder);

        builder.replace(16, 17, "G");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        builder.setLength(8);
        System.out.println(builder);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder stringBuilder) {
        System.out.println("StringBuilder = " + stringBuilder);
        System.out.println("Length = " + stringBuilder.length());
        System.out.println("Capacity = " + stringBuilder.capacity());
    }
}

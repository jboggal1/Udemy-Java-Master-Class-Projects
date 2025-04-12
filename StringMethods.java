public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));
        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "01", "03", "1996");
        System.out.println("newDate = " + newDate);

        String anotherDate = "07";
        anotherDate = anotherDate.concat("/");
        anotherDate = anotherDate.concat("07");
        anotherDate = anotherDate.concat("/");
        anotherDate = anotherDate.concat("2013");
        System.out.println("anotherDate = " + anotherDate);

        String oneMoreDate = "12" + "/" + "30" + "/" + "1999";
        System.out.println("oneMoreDate = " + oneMoreDate);

        String yetAnotherDate = "03".concat("/").concat("22").concat("/").concat("1997");
        System.out.println("yetAnotherDate = " + yetAnotherDate);

        System.out.println("Replaced newDate = " + newDate.replace('/', '-'));

        System.out.println("Replaced oneMoreDate = " + oneMoreDate.replace("9", "8"));

        System.out.println("Replaced newDate = " + newDate.replaceFirst("/", "-"));

        System.out.println("Replaced oneMoreDate = " + oneMoreDate.replaceAll("/", "---"));

        System.out.println("***\t".repeat(7));
        System.out.println("-".repeat(52));

        System.out.println("***\n".repeat(3).indent(8));
        System.out.println("-".repeat(52));

        System.out.println("***\n".repeat(3).indent(-2));
        System.out.println("-".repeat(52));
    }
}

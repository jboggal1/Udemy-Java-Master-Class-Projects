public class StatementsWhiteSpaceAndIndenting {
    public static void main(String[] args) {
        int myVariable = 50; // this entire line is a valid Java statement.
        myVariable++; // the semicolon makes this an statement, without the semicolon it will be an
                      // expression.
        myVariable--;

        System.out.println("This is a test."); // this is also a statement
        // statements doesn't have to be in one line.
        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;
        anotherVariable--;
        System.out.println("anotherVariable = " + anotherVariable);

        if (anotherVariable == 0) {
            System.out.println("It is now zero.");
        }
    }
}

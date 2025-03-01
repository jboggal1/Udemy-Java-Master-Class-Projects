public class OperatorPrecedence {
    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double sum = (firstDouble + secondDouble) * 100.00;
        System.out.println("My value total is " + sum);
        double remainder = sum % 40.00;
        System.out.println("My remainder is " + remainder);
        boolean condition = (remainder == 0.00) ? true : false;
        System.out.println("condition = " + condition);
        if (!condition)
            System.out.println("Got some remainder");
    }
}

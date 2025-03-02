public class Main {
    public static void main(String[] args) {
        Customer defaultCustomer = new Customer();
        defaultCustomer.printAttributeValues();

        Customer annMary = new Customer("Ann Mary George", 7500, "annmary@myemail.com");
        annMary.printAttributeValues();

        Customer benjamin = new Customer("Benjamin", "benjamin@myemail.com");
        benjamin.printAttributeValues();
    }
}

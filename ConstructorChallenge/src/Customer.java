public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("Jane Doe", "janedoe@myemail.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 2000, emailAddress);
    }

    public void printAttributeValues() {
        System.out.println("\nName: " + name + "\nCreditLimit: $" + creditLimit + "\nEmail Address: " + emailAddress);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}

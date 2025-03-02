public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("Default Account Number", 0.00, "Default Name", "Default Email", "Default Phone Number");
        System.out.println("Empty constructor called.");
    }

    public Account(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("34567", 200.55, customerName, email, phoneNumber);
        /*
         * this.customerName = customerName;
         * this.email = email;
         * this.phoneNumber = phoneNumber;
         */
    }

    public void depositFunds(double funds) {
        accountBalance += funds;
        System.out.println("Deposit of $" + funds + " made. New Balance is $" + accountBalance);
    }

    public void withdrawFunds(double funds) {
        double remainingBalance = accountBalance - funds;
        if (remainingBalance < 0) {
            System.out.println("Insufficient Funds! You only have $" + accountBalance + " in your account.");
        } else {
            accountBalance = remainingBalance;
            System.out.println("Withdrawal of $" + funds + " processed. Remaining balance = $" + accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}

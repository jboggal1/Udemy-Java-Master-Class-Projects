public class Main {
    public static void main(String[] args) {
        Account bobAccount = new Account("1234", 1000.00, "Bob Brown", "bobbrown@myemail.com", "(807) 123-4567");

        Account defaultAccount = new Account();
        System.out.println(defaultAccount.getCustomerName());

        Account timsAccount = new Account("Tim", "tim@myemail.com", "112345");
        System.out
                .println("Account No: " + timsAccount.getAccountNumber() + "\nName: " + timsAccount.getCustomerName());

        /*
         * bobAccount.setAccountNumber("1234");
         * bobAccount.setAccountBalance(1000.00);
         * bobAccount.setCustomerName("Bob Brown");
         * bobAccount.setEmail("bobbrown@myemail.com");
         * bobAccount.setPhoneNumber("(807) 123-4567");
         */

        bobAccount.withdrawFunds(100.0);
        bobAccount.depositFunds(250);
        bobAccount.withdrawFunds(50);
        /*
         * bobAccount.withdrawFunds(200);
         * bobAccount.depositFunds(100);
         * bobAccount.withdrawFunds(45.55);
         * bobAccount.withdrawFunds(54.46);
         */
    }
}

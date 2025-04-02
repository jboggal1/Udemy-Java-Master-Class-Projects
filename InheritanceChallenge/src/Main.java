public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        Employee joe = new Employee("Joe", "11/11/1990", "03/03/2020");
        System.out.println(joe);

        SalariedEmployee emma = new SalariedEmployee("Joe", "7/05/1992", "12/27/2018", 35000);
        System.out.println(emma);
        System.out.println("Emma's paycheck = $" + emma.collectPay());

        emma.retire();
        System.out.println("Emma's pension check = $" + emma.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Overtime Paycheck = $" + mary.getDoublePay());
    }
}

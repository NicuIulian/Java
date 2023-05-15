public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Tiu Nicu Iulian", 150.79, "iulynicu2@gmail.com");
        System.out.println("The customer " + customer.getName() + " with the email address: "+ customer.getEmailAddress()
        + " has the credit limit $"+ customer.getCreditLimit());

        Customer customer1 = new Customer();
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());

        Customer customer2 = new Customer("Alex", "alex@yahoo.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

    }
}
public class Main {
    public static void main(String[] args) {


        Employee iulian = new Employee("Iulian", "25/09/2001",  "01/01/2020");
        System.out.println(iulian);
        System.out.println("Age = " + iulian.getAge());
        System.out.println("Pay= " + iulian.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());
    }


}
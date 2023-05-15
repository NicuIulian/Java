public class Employee extends  Worker{
    private long employeeld;
    private String hireDate;

    private static int employeeNo =1;

    public Employee() {
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeld = employeeld;
        this.hireDate = hireDate;
        this.employeeld = Employee.employeeNo++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeld=" + employeeld +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

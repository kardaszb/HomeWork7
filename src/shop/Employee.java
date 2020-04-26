package shop;

public class Employee extends Person {
    protected double salary;


    public Employee(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address);
        this.salary = salary;
    }


    @Override
    public String printInfo() {
        return super.printInfo() + ", " + "salary=" + salary;
    }

}

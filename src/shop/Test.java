package shop;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("Warszawa","poleczki","22a","12");
        Customer customer = new Customer("Jan","Kowalski",address,1500);
        System.out.println(customer.printInfo());

        Employee employee = new Employee("Piotr", "Kropka",address, 11000);
        System.out.println(employee.printInfo());

        Director director = new Director("Kamil", "Borkowski", address, 15000);
        director.setBonus(true);
        System.out.println(director.printInfo());

    }
}

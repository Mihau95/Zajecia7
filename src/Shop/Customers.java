package Shop;

import java.util.Scanner;

public class Customers {
    public static void main(String[] args) {

        Customer customer = new Customer("Artur", "Kowalski", "Sowiecka", 14, 2344.5);
        Employee employee = new Employee("Bartek", "Rogacz", "Jelenia", 69, 2500);

        customer.showInfo();
        employee.showInfo();
    }
}

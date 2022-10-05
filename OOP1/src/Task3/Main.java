package Task3;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void main(String[] args) {
        customers.add(new Customer("John", "Doe", "johndoe"));
        customers.add(new Customer("Jane", "Doe", "janedoe"));
        customers.add(new Customer("John", "Smith", "johnsmith"));
        customers.add(new Customer("Jane", "Smith", "janesmith"));
        customers.add(new Customer("John", "Dion", "johndion"));
        customers.add(new Customer("Jane", "Dion", "janedion"));

        printCustomers();
    }

    public static void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

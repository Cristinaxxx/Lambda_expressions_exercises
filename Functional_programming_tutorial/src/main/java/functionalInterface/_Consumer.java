package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        // Normal Java function
        Customer maria = new Customer("Maria", "12345");
        greetCustomer(maria);
        greetCustomer2(maria, false);

        // Consumer functional interface
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumer2.accept(maria, false);


    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " +
                customer.customerPhoneNumber);
    }

    static void greetCustomer2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " +
                (showPhoneNumber ? customer.customerPhoneNumber : "*****"));
    }

    // same as above but with Consumer:
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " +
                    customer.customerPhoneNumber);

    // BiConsumer:
    static BiConsumer<Customer, Boolean> greetCustomerConsumer2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber : "*****"));



    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}

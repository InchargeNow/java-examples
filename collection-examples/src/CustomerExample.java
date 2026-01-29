import com.sample.models.Customer;

import java.util.Date;

public class CustomerExample {

    static void main(String[] args) {
        Customer customer1 = new Customer(101, "Alice Johnson", "alice@example.com");
        System.out.println(customer1);

        Customer customer2 = new Customer();

        customer2.setId(1);
        customer2.setName("X X");
        System.out.println(customer2.getId() + ": " + customer2.getName());

        customer1.setDateOfBirth(new Date());

        System.out.println(customer1.getDateOfBirth());

    }
}

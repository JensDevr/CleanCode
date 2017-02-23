package cleancode.domain.customers;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jensde on 23/02/2017.
 */

@Named
public class CustomersRepository {

    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer findByLoyaltyCard(String barcode){
    for (Customer customer : customers){
        if (customer.getLoyaltyCardBarcode().equals(barcode)){
            return customer;
        }
    }
    return null;
    }
}

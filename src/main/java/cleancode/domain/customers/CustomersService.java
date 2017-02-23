package cleancode.domain.customers;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

import static java.util.UUID.randomUUID;

/**
 * Created by jensde on 23/02/2017.
 */
@Named
public class CustomersService {
    @Inject
    private CustomersRepository customersRepository;

    public void addCustomer(String name, String id) {
        customersRepository.addCustomer(new Customer(name, id));
    }

    public List<Customer> getAllCustomers() {
        return customersRepository.getAllCustomers();
    }

    public Customer findByLoyaltyCardBarcode(String barcode){
        return customersRepository.findByLoyaltyCard(barcode);
    }
}

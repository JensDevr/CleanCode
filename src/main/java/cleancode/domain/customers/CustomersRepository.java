package cleancode.domain.customers;

import cleancode.domain.shoppingcart.Item;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.HashSet;
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

    public List <Item> items = new ArrayList<>();

    public List <Item> getItems() {
        return items;
    }

    public void addItem (Item item) {
        items.add(item);
    }

    public Item saveGroceriesByDate (String date) {
        for(Item item : items) {
            if (item.getDate().equals(date)) {
                return item;
            }
        }
        return null;
    }
}

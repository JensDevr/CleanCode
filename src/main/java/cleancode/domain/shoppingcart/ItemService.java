package cleancode.domain.shoppingcart;


import cleancode.domain.customers.CustomersRepository;


import javax.inject.Inject;

/**
 * Created by sannev on 23/02/2017.
 */
public class ItemService {

    @Inject
    private CustomersRepository customersRepository;

    public void addItem(String itemId, String itemName, int price, String date) {
        Item item = new Item(itemId, itemName, price, date);
        customersRepository.addItem(item);
    }

    public Iterable <Item> getAllItems(){
        return customersRepository.getItems();
    }

    public Item saveGroceriesByDate (String date) {
        return customersRepository.saveGroceriesByDate(date);
    }
}

package cleancode.domain.customers;

import cleancode.domain.loyalty.LoyaltyCard;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
/**
 * Created by jensde on 23/02/2017.
 */
public class CustomersServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomersService customersService;

    @Mock
    private CustomersRepository customersRepository;

    @Test
    public void addCostumer_ShouldCallCostumerRepository() {
        String name = "Jens";
        String id = "8";

        customersService.addCustomer(name, id);
        Customer customer = new Customer(name, id);
        verify(customersRepository).addCustomer(customer);
    }

    @Test
    public void getAllCostumers_ShouldReturnAllCostumers() {
        Customer customer1 = new Customer("Jens", "8");
        Customer customer2 = new Customer("Seppe", "9");

        when(customersRepository.getAllCustomers()).thenReturn(Arrays.asList(customer1, customer2));
        List<Customer> actual = customersService.getAllCustomers();

        Assertions.assertThat(actual).containsOnly(customer1, customer2);
    }

    @Test
    public void findByLoyaltyCardBarcode_ShouldReturnCustomer(){
        LoyaltyCard loyaltyCard = new LoyaltyCard("123",12);
        Customer customer = new Customer("Jens","8");

        customer.addLoyaltyCard(loyaltyCard);
        customersRepository.addCustomer(customer);

    }
}
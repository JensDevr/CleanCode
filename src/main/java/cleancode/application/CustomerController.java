package cleancode.application;

import cleancode.domain.customers.Customer;
import cleancode.domain.customers.CustomersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by jensde on 23/02/2017.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Inject
    private CustomersService customersService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void addCostumer(
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "id", required = true) String id){
        customersService.addCustomer(name, id);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> getAllCostumers(){
        return customersService.getAllCustomers();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/find")
    @ResponseBody
    public Customer findByLoyaltyCardBarcode(
            @RequestParam(value = "barcode") String barcode){
    return customersService.findByLoyaltyCardBarcode(barcode);
    }
}
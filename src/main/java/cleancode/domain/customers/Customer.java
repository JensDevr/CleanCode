package cleancode.domain.customers;

import cleancode.domain.loyalty.LoyaltyCard;

import javax.inject.Named;
import javax.persistence.*;

/**
 * Created by jensde on 23/02/2017.
 */
public class Customer {
    private String name;
    private String id;

    @OneToOne(cascade = CascadeType.ALL)
    private LoyaltyCard loyaltyCard;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Customer(){}

    public void addLoyaltyCard(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public String getLoyaltyCardBarcode(){
        return loyaltyCard.getBarcode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return id != null ? id.equals(customer.id) : customer.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

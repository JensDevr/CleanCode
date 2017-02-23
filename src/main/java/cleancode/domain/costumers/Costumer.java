package cleancode.domain.costumers;

import cleancode.domain.loyalty.LoyaltyCard;
import javax.persistence.*;

/**
 * Created by jensde on 23/02/2017.
 */
public class Costumer {
    private final String name;
    private final String id;
    @OneToOne(cascade = CascadeType.ALL)
    private LoyaltyCard loyaltyCard;

    public Costumer(String name, String id) {
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void customerCard (){ }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Costumer costumer = (Costumer) o;

        return id != null ? id.equals(costumer.id) : costumer.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

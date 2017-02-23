package cleancode.domain.costumers;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jensde on 23/02/2017.
 */

@Named
public class CostumersRepository {

    private List<Costumer> costumers = new ArrayList<>();

    public void addCostumer(Costumer costumer) {
        costumers.add(costumer);
    }

    public List<Costumer> getAllCostumers() {
        return costumers;
    }


}

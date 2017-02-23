package cleancode.domain.costumers;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by jensde on 23/02/2017.
 */
@Named
public class CostumersService {
    @Inject
    private CostumersRepository costumersRepository;

    public void addCostumer(String name, String id) {
        costumersRepository.addCostumer(new Costumer(name, id));
    }


    public List<Costumer> getAllCostumers() {
        return costumersRepository.getAllCostumers();
    }
}

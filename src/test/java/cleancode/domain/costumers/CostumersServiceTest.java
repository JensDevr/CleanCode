package cleancode.domain.costumers;

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
public class CostumersServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CostumersService costumersService;

    @Mock
    private CostumersRepository costumersRepository;

    @Test
    public void addCostumer_ShouldCallCostumerRepository() {
        String name = "Jens";
        String id = "8";

        costumersService.addCostumer(name, id);
        Costumer costumer = new Costumer(name, id);
        verify(costumersRepository).addCostumer(costumer);
    }

    @Test
    public void getAllCostumers_ShouldReturnAllCostumers() {
        Costumer costumer1 = new Costumer("Jens", "8");
        Costumer costumer2 = new Costumer("Seppe", "9");

        when(costumersRepository.getAllCostumers()).thenReturn(Arrays.asList(costumer1, costumer2));
        List<Costumer> actual = costumersService.getAllCostumers();

        Assertions.assertThat(actual).containsOnly(costumer1, costumer2);
    }
}

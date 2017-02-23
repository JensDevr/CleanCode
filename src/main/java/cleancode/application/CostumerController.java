package cleancode.application;

import cleancode.domain.costumers.Costumer;
import cleancode.domain.costumers.CostumersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by jensde on 23/02/2017.
 */
@Controller
@RequestMapping("/costumer")
public class CostumerController {
    @Inject
    private CostumersService costumersService;

    @RequestMapping(method = RequestMethod.POST)
    public
    @ResponseBody
    void addCostumer(@RequestParam(value = "name", required = true) String name,
                     @RequestParam(value = "id", required = true) String id){
        costumersService.addCostumer(name, id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<Costumer> getAllCostumers(){
        return costumersService.getAllCostumers();
    }
}

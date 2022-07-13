package proyecto.web.controller;
import org.springframework.web.bind.annotation.*;
import proyecto.dto.DaycareDTO;
import proyecto.service.Daycare.DaycareService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value= "/doggo/daycare", produces = APPLICATION_JSON_VALUE)
public class DaycareController {

    private final DaycareService service;

    public DaycareController(DaycareService service) {
        this.service = service;
    }

    @GetMapping()
    List<DaycareDTO> listDaycare(){
        return service.listDaycare();
    }

    @GetMapping(value = "/{address}")
    public List<DaycareDTO> listDaycareAddress(String address){

        return service.findByAddress(address);
    }

    @GetMapping(value = "price/max/{priceMax}/min/{priceMin}")
    public List<DaycareDTO> getDaycarePrice(@PathVariable String priceMax, @PathVariable String priceMin){

        return service.filterDaycareByPrice(priceMax, priceMin);
    }
    @PostMapping(value = "/create")
    public DaycareDTO createDaycare(){

        return null;
    }
}
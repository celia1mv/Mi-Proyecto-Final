package proyecto.service.Daycare;

import proyecto.dto.DaycareDTO;
import java.util.List;

public interface DaycareService {

    List<DaycareDTO> listDaycare();
    List<DaycareDTO> filterDaycareByPrice(String priceMax, String priceMin);
}


package proyecto.service.mapper;

import org.springframework.context.annotation.Configuration;
import proyecto.data.entity.DaycareEntity;
import proyecto.dto.DaycareDTO;


    @Configuration
    public class DaycareMapper {
        public DaycareDTO convertEntityToDto(DaycareEntity daycareEntity) {
            DaycareDTO daycareDto = new DaycareDTO();
            daycareDto.setId(daycareEntity.getId());
            daycareDto.setName(daycareEntity.getName());
            daycareDto.setNight_price(daycareEntity.getNight_price());
            return daycareDto;
        }
    }
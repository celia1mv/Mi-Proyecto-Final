package proyecto.service.mapper;

import org.springframework.context.annotation.Configuration;
import proyecto.data.entity.Daycare;
import proyecto.dto.DaycareDTO;


    @Configuration
    public class DaycareMapper {
        public DaycareDTO convertEntityToDto(Daycare daycare) {
            DaycareDTO daycareDto = new DaycareDTO();
            daycareDto.setId(daycare.getId());
            daycareDto.setName(daycare.getName());
            daycareDto.setAddress(daycare.getAddress());
            daycareDto.setNightPrice(daycare.getNightPrice());
            daycareDto.setRanking(daycare.getRanking());
            return daycareDto;
        }

        public Daycare toEntity(DaycareDTO daycareDTO) {
            final Daycare entity = new Daycare();
            entity.setId(daycareDTO.getId());
            entity.setName(daycareDTO.getName());
            entity.setNightPrice(daycareDTO.getNightPrice());
            entity.setPhone(daycareDTO.getPhone());
            entity.setEmail(daycareDTO.getEmail());
            entity.setName(daycareDTO.getName());
            entity.setAddress(daycareDTO.getAddress());
            entity.setRanking(daycareDTO.getRanking());
            return entity;
        }


    }

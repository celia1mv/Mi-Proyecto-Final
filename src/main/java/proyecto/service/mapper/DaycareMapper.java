package proyecto.service.mapper;

import org.springframework.stereotype.Service;
import proyecto.data.entity.Daycare;
import proyecto.dto.DaycareDTO;

@Service
public class DaycareMapper extends  AbstractServiceMapper<Daycare, DaycareDTO> {

    @Override
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

    @Override
    public DaycareDTO toDto(Daycare daycare) {
        final DaycareDTO dto = new DaycareDTO();
        dto.setId(daycare.getId());
        dto.setName(daycare.getName());
        dto.setNightPrice(daycare.getNightPrice());
        dto.setPhone(daycare.getPhone());
        dto.setEmail(daycare.getEmail());
        dto.setName(daycare.getName());
        dto.setAddress(daycare.getAddress());
        dto.setRanking(daycare.getRanking());
        return dto;
    }
}

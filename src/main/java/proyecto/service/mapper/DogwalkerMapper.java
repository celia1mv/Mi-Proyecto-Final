package proyecto.service.mapper;

import org.springframework.stereotype.Service;
import proyecto.data.entity.DogWalker;
import proyecto.dto.DogWalkerDTO;

@Service
public class DogwalkerMapper extends AbstractServiceMapper<DogWalker, DogWalkerDTO> {

    @Override
    public DogWalker toEntity(DogWalkerDTO dogWalkerDTO) {
        final DogWalker entity = new DogWalker();
        entity.setId(dogWalkerDTO.getId());
        entity.setAddress(dogWalkerDTO.getAddress());
        entity.setEmail(dogWalkerDTO.getEmail());
        entity.setName(dogWalkerDTO.getName());
        entity.setPhone(dogWalkerDTO.getPhone());
        entity.setRanking(dogWalkerDTO.getRanking());
        entity.setPrice_walk(dogWalkerDTO.getPrice_walk());

        return entity;
    }

    @Override
    public DogWalkerDTO toDto(DogWalker dogwalker) {
        final DogWalkerDTO dto = new DogWalkerDTO();
        dto.setId(dogwalker.getId());
        dto.setAddress(dogwalker.getAddress());
        dto.setEmail(dogwalker.getEmail());
        dto.setName(dogwalker.getName());
        dto.setPhone(dogwalker.getPhone());
        dto.setRanking(dogwalker.getRanking());
        dto.setPrice_walk(dogwalker.getPrice_walk());
        return dto;
    }
}
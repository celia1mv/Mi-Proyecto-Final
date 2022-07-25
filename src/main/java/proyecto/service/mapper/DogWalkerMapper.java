package proyecto.service.mapper;

import org.springframework.stereotype.Service;
import proyecto.data.entity.DogWalker;
import proyecto.dto.DogWalkerDTO;

@Service
public class DogWalkerMapper extends AbstractServiceMapper<DogWalker, DogWalkerDTO> {

    @Override
    public DogWalker toEntity(DogWalkerDTO dogwalkerDTO) {
        final DogWalker entity = new DogWalker();
        entity.setId(dogwalkerDTO.getId());
        entity.setDoc_identification(dogwalkerDTO.getDoc_identification());
        entity.setName(dogwalkerDTO.getName());
        entity.setPhone(dogwalkerDTO.getPhone());
        entity.setEmail(dogwalkerDTO.getEmail());
        entity.setSurname(dogwalkerDTO.getSurname());
        entity.setUserName(dogwalkerDTO.getUserName());
        entity.setPassword(dogwalkerDTO.getPassword());
        entity.setBirthdate(dogwalkerDTO.getBirthdate());
        entity.setAvailability(dogwalkerDTO.getAvailability());
        entity.setMax_num_dogs(dogwalkerDTO.getMax_num_dogs());
        entity.setWeight_dogs(dogwalkerDTO.getWeight_dogs());
        entity.setSterilized(dogwalkerDTO.getSterilized());
        entity.setReviews(dogwalkerDTO.getReviews());
        entity.setAssessment(dogwalkerDTO.getAssessment());
        entity.setPrice_walk(dogwalkerDTO.getPrice_walk());
        entity.setProfile_picture(dogwalkerDTO.getProfile_picture());
        entity.setGallery(dogwalkerDTO.getGallery());
        entity.setAddress(dogwalkerDTO.getAddress());
        return entity;
    }

    @Override
    public DogWalkerDTO toDto(DogWalker dogwalker) {
        final DogWalkerDTO dto = new DogWalkerDTO();
        dto.setId(dogwalker.getId());
        dto.setDoc_identification(dogwalker.getDoc_identification());
        dto.setName(dogwalker.getName());
        dto.setPhone(dogwalker.getPhone());
        dto.setEmail(dogwalker.getEmail());
        dto.setSurname(dogwalker.getSurname());
        dto.setUserName(dogwalker.getUserName());
        dto.setPassword(dogwalker.getPassword());
        dto.setBirthdate(dogwalker.getBirthdate());
        dto.setAvailability(dogwalker.getAvailability());
        dto.setMax_num_dogs(dogwalker.getMax_num_dogs());
        dto.setWeight_dogs(dogwalker.getWeight_dogs());
        dto.setSterilized(dogwalker.getSterilized());
        dto.setReviews(dogwalker.getReviews());
        dto.setAssessment(dogwalker.getAssessment());
        dto.setPrice_walk(dogwalker.getPrice_walk());
        dto.setProfile_picture(dogwalker.getProfile_picture());
        dto.setGallery(dogwalker.getGallery());
        dto.setAddress(dogwalker.getAddress());
        return dto;
    }
}

package proyecto.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import proyecto.data.entity.DogWalker;
import proyecto.data.repository.DogWalkerRepository;
import proyecto.data.repository.UserRepository;
import proyecto.dto.DogWalkerDTO;
import proyecto.service.mapper.DogwalkerMapper;


@Service
public class DogwalkerService extends AbstractBusinessService<DogWalker, Integer, DogWalkerDTO, DogWalkerRepository, DogwalkerMapper> {

    private final UserRepository userRepository;

    protected DogwalkerService(DogWalkerRepository repository, DogwalkerMapper serviceMapper, UserRepository userRepository) {
        super(repository, serviceMapper);
        this.userRepository = userRepository;
    }
    //Obtener el listado del las guarderías para perros
    public Page<DogWalkerDTO> findAll(Pageable pageable) {
        return getRepository().findAll(pageable).map(getServiceMapper()::toDto);
    }

    //Modificar una guardería para perros
    @Override
    public DogWalkerDTO save(DogWalkerDTO dto) {
        final DogWalker entity = getServiceMapper().toEntity(dto);
        final DogWalker savedEntity = this.getRepository().save(entity);
        return getServiceMapper().toDto(savedEntity);
    }


}
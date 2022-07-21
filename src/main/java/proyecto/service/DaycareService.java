package proyecto.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import proyecto.data.entity.Daycare;
import proyecto.data.repository.DaycareRepository;
import proyecto.data.repository.UserRepository;
import proyecto.dto.DaycareDTO;
import proyecto.service.mapper.DaycareMapper;

@Service

public class DaycareService extends AbstractBusinessService<Daycare, Integer, DaycareDTO, DaycareRepository, DaycareMapper> {

    private final UserRepository userRepository;

    protected DaycareService(DaycareRepository repository, DaycareMapper serviceMapper, UserRepository userRepository) {
        super(repository, serviceMapper);
        this.userRepository = userRepository;
    }
    //Obtener el listado del las guarderías para perros
    public Page<DaycareDTO> findAll(Pageable pageable) {
        return getRepository().findAll(pageable).map(getServiceMapper()::toDto);
    }

    //Modificar una guardería para perros
    @Override
    public DaycareDTO save(DaycareDTO dto) {
        final Daycare entity = getServiceMapper().toEntity(dto);
        final Daycare savedEntity = this.getRepository().save(entity);
        return getServiceMapper().toDto(savedEntity);
    }
}
package proyecto.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import proyecto.data.entity.RoleEntity;
import proyecto.data.repository.RoleRepository;
import proyecto.data.repository.UserRepository;
import proyecto.dto.RoleDTO;
import proyecto.service.mapper.RoleServiceMapper;

@Service
public class RoleService extends AbstractBusinessService<RoleEntity, Integer, RoleDTO, RoleRepository, RoleServiceMapper> {

    private final UserRepository userRepository;

    protected RoleService(RoleRepository repository, RoleServiceMapper serviceMapper, UserRepository userRepository) {
        super(repository, serviceMapper);
        this.userRepository = userRepository;
    }
    //Obtener el listado del los libros
    public Page<RoleDTO> findAll(Pageable pageable) {
        return getRepository().findAll(pageable).map(getServiceMapper()::toDto);
    }

}
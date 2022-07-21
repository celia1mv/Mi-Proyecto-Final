package proyecto.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import proyecto.data.entity.UserEntity;
import proyecto.data.repository.UserRepository;
import proyecto.dto.UserDTO;
import proyecto.service.mapper.UserServiceMapper;

@Service
public class UserService extends AbstractBusinessService<UserEntity, Integer, UserDTO, UserRepository, UserServiceMapper> {


    protected UserService(UserRepository repository, UserServiceMapper serviceMapper) {
        super(repository, serviceMapper);
    }

    //Obtener el listado del los libros
    public Page<UserDTO> findAll(Pageable pageable) {
        return getRepository().findAll(pageable).map(getServiceMapper()::toDto);
    }

    //Modificar un libro
    @Override
    public UserDTO save(UserDTO dto) {
        final UserEntity entity = getServiceMapper().toEntity(dto);
        final UserEntity savedEntity = this.getRepository().save(entity);
        return getServiceMapper().toDto(savedEntity);
    }
}
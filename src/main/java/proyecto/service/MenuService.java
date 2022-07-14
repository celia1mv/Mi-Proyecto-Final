package proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.data.entity.MenuEntity;
import proyecto.data.entity.RoleEntity;
import proyecto.data.entity.UserEntity;
import proyecto.data.repository.MenuRepository;
import proyecto.data.repository.RoleRepository;
import proyecto.data.repository.UserRepository;
import proyecto.dto.MenuDTO;
import proyecto.service.mapper.MenuServiceMapper;

import java.util.Collection;
import java.util.List;

@Service
public class MenuService extends AbstractBusinessService<MenuEntity, Integer, MenuDTO, MenuRepository, MenuServiceMapper> {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    protected MenuService(MenuRepository repository, MenuServiceMapper serviceMapper,
                          UserRepository userRepository, RoleRepository roleRepository) {
        super(repository, serviceMapper);
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public List<MenuDTO> getMenuForUserId(Integer userId) {
        UserEntity user = this.userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException(String.format("The user ID %s does not exist", userId)));
        return getMenuForRole(user.getRole());
    }

    public List<MenuDTO> getMenuForRole(Collection<RoleEntity> roleEntities) {
        return null;
        //List<MenuEntity> menuEntities = this.getRepository().findDistinctByRolesIn(roleEntities);
        //return this.getServiceMapper().toDto(menuEntities);
    }
}

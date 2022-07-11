package proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.data.entity.Menu;
import proyecto.data.entity.Role;
import proyecto.data.entity.User;
import proyecto.data.repository.MenuRepository;
import proyecto.data.repository.RoleRepository;
import proyecto.data.repository.UserRepository;
import proyecto.dto.MenuDTO;
import proyecto.service.mapper.MenuServiceMapper;

import java.util.Collection;
import java.util.List;

@Service
public class MenuService extends AbstractBusinessService<Menu, Integer, MenuDTO, MenuRepository, MenuServiceMapper> {

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
        User user = this.userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException(String.format("The user ID %s does not exist", userId)));
        return getMenuForRole(user.getRoles());
    }

    public List<MenuDTO> getMenuForRole(Collection<Role> roles) {
        List<Menu> menus = this.getRepository().findDistinctByRolesIn(roles);
        return this.getServiceMapper().toDto(menus);
    }
}

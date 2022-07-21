package proyecto.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.data.entity.Menu;
import proyecto.data.entity.Role;

import java.util.Collection;
import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

    List<Menu> findDistinctByRoleIn(Collection<Role> roleEntities);
}

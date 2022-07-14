package proyecto.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.data.entity.MenuEntity;
import proyecto.data.entity.RoleEntity;

import java.util.Collection;
import java.util.List;

public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {

    //List<MenuEntity> findDistinctByRolesIn(Collection<RoleEntity> roleEntities);
}

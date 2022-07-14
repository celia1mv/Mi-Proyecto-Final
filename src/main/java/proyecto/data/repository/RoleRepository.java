package proyecto.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.data.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
}

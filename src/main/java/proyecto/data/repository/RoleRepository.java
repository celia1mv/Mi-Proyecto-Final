package proyecto.data.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.data.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}

package proyecto.data.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.data.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserNameAndActiveTrue(String username);

    Page<User> findAll(Pageable pageable);



}

package proyecto.data.repository;


import com.example.proyecto.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserNameAndActiveTrue(String username);


}

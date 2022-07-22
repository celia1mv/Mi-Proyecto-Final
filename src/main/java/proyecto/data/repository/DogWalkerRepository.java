package proyecto.data.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.data.entity.DogWalker;


public interface DogWalkerRepository extends JpaRepository<DogWalker, Integer> {
    Page<DogWalker> findAll(Pageable pageable);
}

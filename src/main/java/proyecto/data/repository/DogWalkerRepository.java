package proyecto.data.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import proyecto.data.entity.DogWalker;

public interface DogWalkerRepository {
    Page<DogWalker> findAll(Pageable pageable);

}

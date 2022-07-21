package proyecto.data.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import proyecto.data.entity.DogWalkerEntity;

public interface DogWalkerRepository {
    Page<DogWalkerEntity> findAll(Pageable pageable);

}

package proyecto.data.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.data.entity.Daycare;


public interface DaycareRepository extends JpaRepository<Daycare,Integer> {

    Page<Daycare> findAll(Pageable pageable);


}
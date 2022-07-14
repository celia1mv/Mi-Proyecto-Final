package proyecto.data.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import proyecto.data.entity.DaycareEntity;

import java.util.List;

@Repository
public interface DaycareRepository extends CrudRepository<DaycareEntity,Long> {

    List<DaycareEntity> findAll();

    List<DaycareEntity> findByAddressContaining(String address);

    @Query(value = "SELECT * FROM daycare WHERE night_price > :priceMax AND night_price < :priceMin", nativeQuery = true)
    List<DaycareEntity> findPriceFilter(float priceMax, float priceMin);


}
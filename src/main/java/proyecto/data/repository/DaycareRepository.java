package proyecto.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import proyecto.data.entity.Daycare;

import java.util.List;

@Repository
public interface DaycareRepository extends JpaRepository<Daycare,Integer> {

    List<Daycare> findAll();

    List<Daycare> findByAddressContaining(String address);

    @Query(value = "SELECT * FROM daycare WHERE night_price > :priceMax AND night_price < :priceMin", nativeQuery = true)
    List<Daycare> findPriceFilter(float priceMax, float priceMin);


}
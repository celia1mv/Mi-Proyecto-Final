package proyecto.service.Daycare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.data.entity.DaycareEntity;
import proyecto.data.repository.DaycareRepository;
import proyecto.dto.DaycareDTO;
import proyecto.service.mapper.DaycareMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class DaycareServiceImpl implements DaycareService{

    @Autowired
    private DaycareRepository repository;
    @Autowired
    private DaycareMapper mapper;

    @Override
    public List<DaycareDTO> listDaycare() {
        List<DaycareDTO>listDaycareDto = new ArrayList<>();

        List<DaycareEntity> DaycareEntityList = repository.findAll();

       DaycareEntityList.forEach(Daycare -> {
            listDaycareDto.add(mapper.convertEntityToDto(Daycare));
        });

        return listDaycareDto;
    }

    @Override
    public List<DaycareDTO> findByAddress(String address){
        List<DaycareDTO>listDaycareDto = new ArrayList<>();

        List<DaycareEntity> DaycareEntityList = repository.findByAddressContaining(String.valueOf(address));

        DaycareEntityList.forEach(Daycare -> {
            listDaycareDto.add(mapper.convertEntityToDto(Daycare));
        });

        return listDaycareDto;
    }

    @Override
    public List<DaycareDTO> filterDaycareByPrice(String priceMax, String priceMin) {
        List<DaycareDTO>listDaycareDto = new ArrayList<>();

        List<DaycareEntity> DaycareEntityList = repository.findPriceFilter(Float.parseFloat(priceMax),Float.parseFloat(priceMin));

        DaycareEntityList.forEach(Daycare -> {
            listDaycareDto.add(mapper.convertEntityToDto(Daycare));
        });

        return listDaycareDto;
    }

}